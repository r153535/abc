object FactorialCollection {
  def factorial(n: Int): Int = {
    if (n == 0) 1
    else (1 to n).product
  }

  def factorialCollection(items: Seq[Int]): Seq[Int] = {
    items.map(factorial)
  }

  def main(args: Array[String]): Unit = {
    val items = Seq(3, 4, 5)
    val factorials = factorialCollection(items)
    println(s"Factorials: ${factorials.mkString(" ")}")
  }
}
