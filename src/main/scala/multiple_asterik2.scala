object multiple_asterik2 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5 by 1) {
      println("*" * (2 * i - 1))
    }
    for (i <- 5 to 1 by -1) {
      println("*" * (2 * i - 1))
    }
  }

}
