package rpnkv.iv

import org.scalatest.Matchers.convertToAnyShouldWrapper

class SecondTest extends org.scalatest.FunSuite{

    test("test 1") {
      Second.switchesCount(List(-1, 1, 0, 2, -2, 5)) shouldEqual 3
    }

    test("test 2") {
      Second.switchesCount(List(1, 1, 0, 2, 5)) shouldEqual 0
    }

    test("test 3") {
      Second.switchesCount(List(1, 1, 0, 0, 0, 0, 0, 2, 5)) shouldEqual 0
    }

    test("test 4") {
      Second.switchesCount(List(1, -1, 0, 0, 2, 5)) shouldEqual 2
    }

    test("test 5") {
      Second.switchesCount(List(1, -1, 0, 0, 2, -5)) shouldEqual 3
    }

    test("test 6") {
      Second.switchesCount(List(1, -5, 1)) shouldEqual 2
    }

}
