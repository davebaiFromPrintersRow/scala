object payroll {

  var rate = 10.5

  def earnings(s: String, hours: Double): String = {
    if (s == "h") {
      if (hours <= 40) {
        "paycheck is $" + (hours * rate)
      }
      else {
        "pay is $" + ((hours - 40) * 1.5 + 40 * rate)
      }
    }
    else {
      "salaried b"
    }
  }

  println(earnings("h", 20))
  println(earnings("h", 40))
  println(earnings("h", 50))
  println(earnings("s", 0))
}