object setExamples extends App {

  val fruit = Set("apple", "orange", "banana")
  var moreFruit = Set("kiwi", "pineapple")

  var nums = Set(1, 2, 3, 4, 5)
  var moreNums = Set(6, 7, 8, 9)

  println(nums.contains(5))

  var mixed = fruit ++ nums

  println(mixed)

  println(nums(3))
  nums -= 5
  println(nums)
  println(nums & moreNums)

  println(moreFruit.head)
  println(moreFruit.tail)
}
