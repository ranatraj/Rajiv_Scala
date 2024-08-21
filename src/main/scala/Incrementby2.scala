object Incrementby2 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {
      val star = "*" * (2 * i - 1)
      println(star)
    }
  }
  }
