object array12 {
  def main(args: Array[String]): Unit = {
    var arr = Array(10, 20, 30)
    var sum = 0
    for (i<-0 to arr.length-1)
    {
      sum = sum+arr(i)
    }
    println(sum)
  }
}
