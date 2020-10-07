package rpnkv.iv

object Second {
  def switchesCount(list: List[Integer]): Integer = {
    val listNoZeros = list.filter(notZero)
    listNoZeros
      .headOption match {
      case Some(head) =>
        listNoZeros.take(1)
          .foldLeft(0 -> head)(merge)
        0

      case None => 0
    }
  }

  def merge(prev: (Integer, Integer), current: Integer): (Integer ,Integer) = {
    Integer(0) -> Integer(0)
  }

  def notZero(int: Integer): Boolean = int != 0

  def pair: (String, String) = {
    "x" -> "x"
  }
}
