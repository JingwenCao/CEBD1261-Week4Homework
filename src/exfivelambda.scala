

object exfivelambda {
  def main(args:Array[String]) {
    val i = List(3,5)
    val cube = i.map((x:Int) => x * x * x)
    println(cube)
  }
}