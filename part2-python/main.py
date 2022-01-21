class TestCase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def run(self, result):
        result.testStarted()
        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()

    def tearDown(self):
        pass


class WasRun(TestCase):
    def __init__(self, name):
        TestCase.__init__(self, name)
        self.log = None

    def testMethod(self):
        self.log = self.log + "testMethod "

    def setUp(self):
        self.log = "setUp "

    def tearDown(self):
        self.log = self.log + "tearDown "


class TestCaseTest(TestCase):
    def setUp(self):
        self.test = WasRun("testMethod")

    def testTemplateMethod(self):
        test = WasRun("testMethod")
        test.run()
        assert ("setUp testMethod " == test.log)

    def testSetUp(self):
        self.test.run()
        assert ("setUp testMethod " == self.test.log)


if __name__ == '__main__':
    TestCaseTest("testRunning").run()
    TestCaseTest("testSetUp").run()
