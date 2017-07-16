object ArrayChallenge extends App {

  def avg(a: Array[Int]): Double = {
    var sum = 0
    for (v <- a) yield sum += v
    sum / a.length
  }

  def facRecursive(n: Int): Int = if (n <= 0) 1 else n * facRecursive(n - 1)

  var min = (a: Array[Int]) => {
    var m = a(0)
    for (v <- a) if (v < m) m = v
    m
  }

  def max(a: Array[Int]): Int = {
    var m = a(0)
    for (v <- a) if (v > m) m = v
    m
  }

  var maxAnonymous = (a: Array[Int]) => {
    var m = a(0)
    for (v <- a) {
      if (v > m) {
        m = v
      }
    }
    m
  }

  //  array with 10 val, avg, sum, min, max
  var numArray = Array(10, 20, 35, 4, 34, 45, 100)
  println("average is " + avg(numArray))
  println("min is " + min(numArray))
  println("max is " + max(numArray))
  println("max is " + maxAnonymous(numArray))
}
