class ConstructorTest:
    def __init__(self, field1):
        self.field1 = field1
        self.field2 = field1 * self.field1 * 5

class TestClass:
    def test_method(self):
        test = ConstructorTest(3)
        print test.field2

TestClass().test_method()