object loopsPractice {
  var x = 10
  while (x >= 0) {
    println(x)
    x -= 1
  }
  println("blast off")

  var y = 10
  do {
    println(y)
    y -= 1
  } while (y > 0)
  println("blast off again")

  var z = 10
  for (z <- 10 to 0 by -1) {
    println(z)
  }
  println("last blast off")

  var a = for (num <- 1 to 10) yield num + 1

  var word = "monday"

  for (x <- 0 until word.length) {
    println(word(x))
  }
}