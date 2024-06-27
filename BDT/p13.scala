object BinarySearch {
  def binarySearch(list: List[Int], target: Int): Boolean = {
    def search(low: Int, high: Int): Boolean = {
      if (low > high) false
      else {
        val mid = (low + high) / 2
        if (list(mid) == target) true
        else if (list(mid) > target) search(low, mid - 1)
        else search(mid + 1, high)
      }
    }
    search(0, list.length - 1)
  }

  def main(args: Array[String]): Unit = {
    val sortedList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val target = 5
    val notPresentTarget = 11

    println(s"Is $target in the list? ${binarySearch(sortedList, target)}")
    println(s"Is $notPresentTarget in the list? ${binarySearch(sortedList, notPresentTarget)}")
  }
}
