#flake8: NOQA

dividers = (2, 3, 5, 7, 11, 13, 17, 19)

def divided(x=21):
    while True:
        if not all(filter(lambda z: not bool(x % z), dividers)):
            return x
        x += 1

print divided()
