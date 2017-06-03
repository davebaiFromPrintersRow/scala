object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello")

    var firstName: String = "dave"
    val age: Int = 99
    println(firstName + ", is " + age + " years old")
    var sum = 10 + 25

    def function1: Unit = {
      println("Function1")
    }
    function1
  }
}