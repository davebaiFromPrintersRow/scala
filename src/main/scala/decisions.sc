object decisions {
  var today = "Monday"

  if (today == "Monday") println("might rain")
  else println("no rain b")

  var b = 5
  var a = if (b < 0) -1 else 1
  println(a)

  println(if (b < 0) "-" else if (b == 0) "0" else "+")

  var rate = 10.50

  def earnings(s: String, h: Double): String = {
    if (s != "y") {
      if (h <= 40)
        "salary is: $" + h * rate
      else {
        "salary is: $" + (40 * rate + (h - 40) * rate * 1.5)
      }
    }
    else {
      "this is salaried employee"
    }
  }

  println(earnings("n", 30))
}

