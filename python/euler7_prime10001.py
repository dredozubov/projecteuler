import sys


class TailRecurseException:
    def __init__(self, g, args, kwargs):
        self.g = g
        self.args = args
        self.kwargs = kwargs


def tail_call_optimized(g):
    """
    This function decorates a function with tail call
    optimization. It does this by throwing an exception
    if it is it's own grandparent, and catching such
    exceptions to fake the tail call optimization.

    This function fails if the decorated
    function recurses in a non-tail context.
    """
    def func(*args, **kwargs):
        f = sys._getframe()
        if f.f_back and f.f_back.f_back and \
            f.f_back.f_back.f_code == f.f_code:
            raise TailRecurseException(g, args, kwargs)
        else:
            newg = g
            while 1:
                try:
                    return newg(*args, **kwargs)
                except TailRecurseException, e:
                    newg = e.g
                    args = e.args
                    kwargs = e.kwargs
    func.__doc__ = g.__doc__
    return func


@tail_call_optimized
def get_prime(n, counter=0, start=2, exclude=frozenset()):
    if counter == n:
        return start - 1
    if all(map(lambda x: start % x, exclude)):
        new_exclude = exclude.union([start])
        counter += 1
    else:
        new_exclude = exclude
    return get_prime(n, counter, start + 1, new_exclude)


def p(n):
    print '%dth prime number is %d' % (n, get_prime(n))


p(10001)
#[p(i) for i in xrange(1, 100)]
