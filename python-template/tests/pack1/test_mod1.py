import unittest


from src.pack1 import mod1

class Mod1_Test(unittest.TestCase):

    def test_func1(self):
        self.assertEqual("func1func2",mod1.func1())
