object LongestWordFinder {
  def findLongestWord(words: Seq[String]): (String, Int) = {
    words.map(word => (word, word.length)).maxBy(_._2)
  }

  def main(args: Array[String]): Unit = {
    println("Enter words separated by spaces:")
    val input = scala.io.StdIn.readLine().split("\\s+")
    val (longestWord, length) = findLongestWord(input)
    println(s"The longest word is '$longestWord' with length $length")
  }
}
