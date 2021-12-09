from src.pack1.pack2 import mod2
from src.pack1 import mod1
from src.pack3 import mod3

def main():
    print("Toto")
    print(mod1.func1())
    print(mod2.func2())
    print(mod3.func3())
    return 0


if __name__ == '__main__':
    main()
