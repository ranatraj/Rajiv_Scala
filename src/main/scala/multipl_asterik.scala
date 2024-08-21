object multipl_asterik {
  def main(args: Array[String]): Unit = {
    for( i <- 1 to 5)
    {
      val star="*"
      println(star*i)
    }
    for(i <- (5 -1) to 1 by -1)
    {
      val star="*"
      println(star*i)
    }
  }
}
