object payroll extends App {
  var e1 = new Employee("sam", "paulson")
  var e2 = new Employee("Doris", "jones", salaried = 's')

  println(e1)
  println(e2)
}

class Employee(val fName: String, val lName: String, var salaried: Char = 'n') {
  def fullName: String = fName + " " + lName

  var employeeID = Employee.newEEID()

  override def toString = "Employee name: " + fullName + "\nid: " + employeeID +
    (if (salaried == 'n') " \nHourly employee" else "\nSalaried employee") +
    ("\n" + "=" * 20)
}

object Employee {
  var employeeID = 0

  def newEEID() = {
    employeeID += 1
    employeeID
  }
}
