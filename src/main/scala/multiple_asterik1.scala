object multiple_asterik1 {
  def main(args: Array[String]): Unit = {
    for(i <- 5 to 1 by -1)
      {
        val star="*"
        println(star*i)
      }
      for(i <-(1 to 5 by 1)) {
        val star="*"
        println(star*i)
      }
  }

}
