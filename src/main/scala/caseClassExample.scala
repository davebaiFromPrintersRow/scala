object caseClassExample extends App {
  val alice = Person("Alice", 25)
  val rabbit = Person("Bugs", 50)
  val duck = Person("Donald", 21)

  for (person <- List(alice, rabbit, duck)) {
    person match {
      case Person("Alice", 25) => println("hi alice")
      case Person("Bugs", 50) => println("hi bugs bunny")
      case Person("Donald", 21) => println("hi donny")
    }
  }
}

case class Person(fName: String, age: Int)
