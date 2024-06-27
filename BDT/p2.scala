object WordLength {
  def wordLengths(words: Array[String]): Array[Int] = {
    words.map(_.length)
  }

  def main(args: Array[String]): Unit = {
    val words = Array("apple", "banana", "orange", "grapefruit")
    val lengths = wordLengths(words)
    println("Lengths of words:")
    lengths.foreach(len => println(len))
  }
}
