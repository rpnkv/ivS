package rpnkv.iv

object First {
  def switchesCount(list: List[Integer]): Integer = {
    var cnt = 0
    var prev = Option.empty[Integer]

    list
      .filter(v => v != 0)
      .foreach(currentValue => {
        prev match {
          case Some(prevValue) =>
            if (prevValue < 0) {
              if (currentValue > 0) {
                cnt += 1
              }
            } else {
              if (prevValue > 0) {
                if (currentValue < 0) {
                  cnt += 1
                }
              }
            }
          case None =>
        }
        prev = Option(currentValue)
      })

    cnt
  }

  //def f[n] = if (n == 1) n else f(n - 1) + f(n - 1)
}
