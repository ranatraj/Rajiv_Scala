object Right_underscore {
  def main(args: Array[String]): Unit = {
    var a="*"
    for(i <- 1 to 5)
      {
        for( j <- 1 to i) {
          print(a )
          // if j < i then print ( _ )
          if(j<i)
            print("_")
                  }
        println(" ")
      }
  }

}
