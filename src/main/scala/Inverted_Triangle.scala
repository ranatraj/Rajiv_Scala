object Inverted_Triangle {
  def main(args: Array[String]): Unit = {
    var a="*"
    for(i <- 1 to 5)
    {
      for (j <- 5 to i by -1) {
        print(a)
        a = a * 1
      }
      println(" ")
    }
    }
  }
