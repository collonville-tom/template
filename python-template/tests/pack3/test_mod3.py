import unittest


from src.pack3 import mod3



class Mod3_Test(unittest.TestCase):

    def test_func3(self):
        self.assertEqual("func3func1func2",mod3.func3())
