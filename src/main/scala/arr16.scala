object arr16 {
  def main(args: Array[String]): Unit = {
    val arr1=Array(10,20,30)
    val arr2=Array(40,50,60)

    //merge 2 arrays using ++

    val mergedarray=arr1 ++ arr2

    println(mergedarray.mkString(","))
  }
}