import unittest


from src import __main__



class Main_Test(unittest.TestCase):

    def test_main(self):
        self.assertEqual(0,__main__.main())
