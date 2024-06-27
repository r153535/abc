object CapitalizeWord {
  def capitalizeEachWord(sentence: String): String = {
    sentence.split(" ").map(_.capitalize).mkString(" ")
  }

  def main(args: Array[String]): Unit = {
    val sentence = "hello world from scala"
    println(capitalizeEachWord(sentence)) // Output: "Hello World From Scala"
  }
}
