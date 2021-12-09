import string
from .pack2 import mod2

def func1() -> string:
    return "func1{param}".format(param=mod2.func2())