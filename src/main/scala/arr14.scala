import scala.collection.mutable.ArrayBuffer

object arr14 {
  def main(args: Array[String]): Unit = {
      var arr=Array(1,5,4,2,30,22)
      var cnt=0
      while(cnt<arr.size)
        {
          if(arr(cnt)%2==1)
            {
              println(arr(cnt))
            }
            cnt=cnt+1
        }
         }
}
