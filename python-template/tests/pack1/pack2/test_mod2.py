import unittest


from src.pack1.pack2 import mod2



class Mod2_Test(unittest.TestCase):

    def test_func2(self):
        self.assertEqual("func2",mod2.func2())
