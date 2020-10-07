package rpnkv.iv

object Second {
  def switchesCount(list: List[Int]): Int = {
    val listNoZeros = list.filter(notZero)
    listNoZeros
      .headOption match {
      case Some(head) =>
        listNoZeros.foldLeft(0 -> head)(merge)._1
      case None => 0
    }
  }

  def merge(prev: (Int, Int), current: Int): (Int, Int) = {
    val counter =
      if (prev._2 > 0) {
        if (current < 0) {
          prev._1 + 1
        } else {
          prev._1
        }
      } else {
        if (prev._2 < 0) {
          if (current > 0) {
            prev._1 + 1
          } else {
            prev._1
          }
        } else {
          prev._1
        }
      }

    (counter -> current)
  }

  def notZero(int: Int): Boolean = int != 0

  def pair: (String, String) = {
    "x" -> "x"
  }
}
