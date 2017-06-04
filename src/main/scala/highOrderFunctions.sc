object highOrderFunctions {
  val double = (i: Int) => i * 2

  def higherOrder(x: Int, y: Int => Int) = y(x)

  higherOrder(6, double)

  val triple = (i: Int) => i * 3

  higherOrder(6, triple)

  def sayHello = (name: String) => {
    "Hello" + " " + name
  }

  var msg = sayHello("Peg")

  var yOutside = 5
  val multiplierClosure = (x: Int) => x * yOutside

  multiplierClosure(10)
}