package rpnkv.iv

import org.scalatest.Matchers.convertToAnyShouldWrapper

class FirstTest extends org.scalatest.FunSuite {

  test("test 1") {
    First.switchesCount(List(-1, 1, 0, 2, -2, 5)) shouldEqual 3
  }

  test("test 2") {
    First.switchesCount(List(1, 1, 0, 2, 5)) shouldEqual 0
  }

  test("test 3") {
    First.switchesCount(List(1, 1, 0, 0, 0, 0, 0, 2, 5)) shouldEqual 0
  }

  test("test 4") {
    First.switchesCount(List(1, -1, 0, 0, 2, 5)) shouldEqual 2
  }

  test("test 5") {
    First.switchesCount(List(1, -1, 0, 0, 2, -5)) shouldEqual 3
  }

  test("test 6") {
    First.switchesCount(List(1, -5, 1)) shouldEqual 2
  }

}
