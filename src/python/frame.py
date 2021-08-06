class TestCase(object):
    def __init__(self, name):
        self.name = name

    def run(self):
        self.setUp()
        method = getattr(self, self.name)
        method()

    def setUp(self):
        pass


class WasRun(TestCase):
    def __init__(self, name):
        self.wasRun = None
        TestCase.__init__(self, name)

    def testMethod(self):
        self.wasRun = 1
        self.log = self.log + "testMethod"

    def setUp(self):
        self.wasRun = None
        self.wasSetUp = 1
        self.log = "setUp "


class TestCaseTest(TestCase):

    def setUp(self):
        self.test = WasRun("testMethod")

    def testSetUp(self):
        self.test.run()
        assert ("setUp testMethod" == self.test.log)
