object NumberSearch {
def Search(numbers: List[Int], target: Int): Boolean = {
numbers.contains(target)
}
def main(args: Array[String]): Unit = {
val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val target1 = 5
val target2 = 15
println(s"Is $target1 in the list? ${Search(numbers, target1)}")
println(s"Is $target2 in the list? ${Search(numbers, target2)}")
}
}