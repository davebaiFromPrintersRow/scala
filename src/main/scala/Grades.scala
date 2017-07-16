import io.StdIn._

object Grades extends App {
  var done = false
  while (!done) {
    var name = readLine("Enter name:")
    println("Enter score: ")
    var score = readDouble()
    println("you got " + (if (score > 90) " A" else if (score > 80) "B" else if (score > 70) "C" else if (score > 60) "Failed"
    else "turrible")
    )
    println("Enter true if done, else false: ")
    done = readBoolean()
  }
}