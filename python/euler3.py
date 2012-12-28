# flake8: NOQA
from math import sqrt, ceil

def max_prime_factor_of(limit):
    squared = int(ceil(sqrt(limit)))
    bitset = [True for _ in xrange(squared)]
    for i in xrange(2, squared):
        if bitset[i-2]:
            for j in xrange(i*i, squared):
                if not (j - i*i) % i:
                    bitset[j-2] = False

    for i in reversed(xrange(2, squared)):
        if bitset[i-2] and limit % i == 0:
            return i

    return None


print max_prime_factor_of(600851475143)
