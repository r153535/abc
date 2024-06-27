object BubbleSort {
  def bubbleSort(arr: Array[Int]): Array[Int] = {
    val n = arr.length
    for (i <- 0 until n - 1) {
      for (j <- 0 until n - i - 1) {
        if (arr(j) > arr(j + 1)) {
          // Swap arr(j) and arr(j + 1)
          val temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
    }
    arr
  }

  def main(args: Array[String]): Unit = {
    val array = Array(64, 34, 25, 12, 22, 11, 90)
    println("Unsorted array: " + array.mkString(", "))
    val sortedArray = bubbleSort(array)
    println("Sorted array: " + sortedArray.mkString(", "))
  }
}
