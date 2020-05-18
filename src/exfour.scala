

object exfour {
  val fibs: Stream[Int] = 0 #:: fibs.scanLeft(1)(_ + _)
  def main(args: Array[String]) {
    println(fibs take 10 toList)
  }
}