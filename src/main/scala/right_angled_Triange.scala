object right_angled_Triange {
  def main(args: Array[String]): Unit = {
    var a="*"
    for (i <- 1 to 5)
      {
        for(j <- 1 to i )
          {
            print(a)
            a=a*1
          }
        println(" ")
      }
  }

}
