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

    def setUp(self):
        self.wasSetUp = 1


class TestCaseTest(TestCase):
    def testRunning(self):
        test = WasRun("testMethod")
        test.run()

    def testSetUp(self):
        test = WasRun("testMethod")
        test.run()
        assert (test.wasSetUp)
