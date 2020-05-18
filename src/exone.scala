

object exone {
  val x:Double = 42.354562                  //> x  : Double = 42.354562
	val y:Int = 3                             //> y  : Int = 3
	def main (args: Array[String]): Unit = {
		println((x * 100).round / 100.toDouble)
		println("%04d".format(y))
		}                                 //> main: (args: Array[String])Unit
}