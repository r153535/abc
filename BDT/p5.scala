object QuickSort {
  def quickSort(arr: Array[Int]): Unit = {
    def swap(i: Int, j: Int): Unit = {
      val temp = arr(i)
      arr(i) = arr(j)
      arr(j) = temp
    }

    def partition(low: Int, high: Int): Int = {
      val pivot = arr(high)
      var i = low - 1
      for (j <- low until high) {
        if (arr(j) <= pivot) {
          i += 1
          swap(i, j)
        }
      }
      swap(i + 1, high)
      i + 1
    }

    def sort(low: Int, high: Int): Unit = {
      if (low < high) {
        val pi = partition(low, high)
        sort(low, pi - 1)
        sort(pi + 1, high)
      }
    }

    sort(0, arr.length - 1)
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(10, 7, 8, 9, 1, 5)
    println("Original array: " + arr.mkString(", "))
    quickSort(arr)
    println("Sorted array: " + arr.mkString(", "))
  }
}
