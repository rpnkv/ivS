package rpnkv.iv

import org.scalatest.Matchers.convertToAnyShouldWrapper


class ThirdTest extends org.scalatest.FunSuite{

  test("test 1") {
    Third.switchesCount(List(-1, 1, 0, 2, -2, 5)) shouldEqual 3
  }

  test("test 2") {
    Third.switchesCount(List(1, 1, 0, 2, 5)) shouldEqual 0
  }

  test("test 3") {
    Third.switchesCount(List(1, 1, 0, 0, 0, 0, 0, 2, 5)) shouldEqual 0
  }

  test("test 4") {
    Third.switchesCount(List(1, -1, 0, 0, 2, 5)) shouldEqual 2
  }

  test("test 5") {
    Third.switchesCount(List(1, -1, 0, 0, 2, -5)) shouldEqual 3
  }

  test("test 6") {
    Third.switchesCount(List(1, -5, 1)) shouldEqual 2
  }

}
