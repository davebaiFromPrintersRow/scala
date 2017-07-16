object patternMatching extends App {

  def greekAlphabet(letter: Char) = {
    letter match {
      case 'a' | 'A' => "alpha"
      case 'b' | 'B' => "beta"
      case _ => println("invalid char")
    }
  }

  println("greek letter for a is: " + greekAlphabet('a'))

  def max(x: Int, y: Int) = x > y match {
    case true => x
    case false => y
  }

  println(max(50, 20))
}
