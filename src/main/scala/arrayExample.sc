object arrayExample {
  var nums = new Array[Any](10)

  var furniture = Array("Chair", "sofa", "table", "bed")

  for (f <- furniture) println(f)

  println(furniture(0))

  var a = Array(1, 2, 3, 4, 5)
  var result = for (n <- a) yield 2 * n
  var even = for (n <- a if n % 2 == 0) yield n
}