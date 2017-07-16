import io.Source._

object readFromFiles extends App {
  var fileName = "src/main/resources/rainbow.txt"
  for (line <- fromFile(fileName).getLines()) {
    println(line.toUpperCase())
  }
  val fileLines = fromFile(fileName).getLines().toList
  fileLines.foreach(println)
}
