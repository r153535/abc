object QuickSort {
  def quickSort(list: List[Int]): List[Int] = {
    if (list.length <= 1) list
    else {
      val pivot = list(list.length / 2)
      val (less, equal, greater) = list.partition(_ < pivot) match {
        case (l, rest) => (l, rest.filter(_ == pivot), rest.filter(_ > pivot))
      }
      quickSort(less) ++ equal ++ quickSort(greater)
    }
  }

  def main(args: Array[String]): Unit = {
    val unsortedList = List(3, 6, 8, 10, 1, 2, 1)
    val sortedList = quickSort(unsortedList)
    println(s"Sorted list: ${sortedList.mkString(", ")}")
  }
}
