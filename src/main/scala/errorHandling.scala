import java.io.FileNotFoundException

import io.Source._

object errorHandling extends App {

  try {
    for (line <- fromFile("nonexistent").getLines()) {
      println(line.toLowerCase())
    }
  } catch {
    case e: FileNotFoundException => println("The file wasn't found")
    case _: Exception => println("other error")
  }

  try {
    var quotient = 10 / 0
  } catch {
    case e: ArithmeticException => println("can't divide by 0")
  }
}
