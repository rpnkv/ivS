package rpnkv.iv

object Third {

  def switchesCount(list: List[Int]): Int = {
    val listNoZeros = list.filter(Second.notZero)
    listNoZeros
      .headOption match {
      case Some(head) =>
        listNoZeros.foldLeft(0 -> head)(merge)._1
      case None => 0
    }
  }

  def merge(prev: (Int, Int), current: Int): (Int, Int) = {
    if(current * prev._2 < 0){
      prev._1 + 1 -> current
    }else{
      prev._1 -> current
    }
  }

}
