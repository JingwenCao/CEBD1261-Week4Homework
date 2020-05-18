

object exthree {
  def factorial(n: AnyVal): String = {
    n match {
      case i:Int => {
        return factorialHelper(i).toString()
      }
      case j:Double => {
        return factorialHelper(converter(j)).toString()
      }
    }
  }
  
  def factorialHelper(i:Int): Int = {
    if (i==0)
      return 1
    else
      return i * factorialHelper(i-1)
  }
  
  def converter (j:Double): Int = {
    return j.toInt
  }
  
    def main(args: Array[String]) {
      println(factorial(5))
      println(factorial(6))
      println(factorial(8))
      println(factorial(4.52))
  }
}