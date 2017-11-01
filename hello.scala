object Hello {
  def main(args:Array[String]) {
    println(timesTwo(3))
  }

  val timesTwo = multiply(2) _

  def multiply(x:Int)(y:Int):Int = x * y
}
