object functionExamples {
  def abs(x: Int) = if (x < 0) -x else x

  abs(-5)

  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n)
      r = r * i
    r
  }

  fac(5)

  def facRecursive(n: Int): Int = if (n <= 0) 1 else n * facRecursive(n - 1)

  facRecursive(5)

  def printName(firstName: String, lastName: String): Unit = {
    println(firstName + " " + lastName)
  }

  printName(firstName = "Pegg", lastName = "fish")

  printName(lastName = "bai", firstName = "dave")

  def enhancedPrintName(left: String = "[", firstName: String, lastName: String, right: String = "]"): Unit = {
    println(left + firstName + " " + lastName + right)
  }

  enhancedPrintName(lastName = "ray", firstName = "bobby")

  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  sum(1, 2, 3, 4, 5)
}