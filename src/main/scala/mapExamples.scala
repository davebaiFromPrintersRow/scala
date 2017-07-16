object mapExamples extends App {
  var groceries = Map(1 -> "milk", 2 -> "bread", 3 -> "juice", 4 -> "eggs")
  groceries = groceries + (5 -> "hashbrowns")

  println(groceries(3))

  println(groceries.getOrElse(6, "no match"))
  for (v <- groceries.values) println(v)

  var z = for ((k, v) <- groceries) yield (v, k)
  groceries.foreach(println)
}
