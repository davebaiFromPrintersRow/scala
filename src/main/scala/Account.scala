object Account extends App {
  var b1 = new BankAccount("dave bai", 10000000)
  var b2 = new BankAccount("jayz", 34.3, 's')

  List(b1, b2).foreach(println)
}

class BankAccount(name: String, balance: Double, typeOfAcct: Char = 'c') {

  var accountNumber = BankAccount.nextAcctNum

  override def toString = "client name: " + name + " balance: $" + balance +
    (if (typeOfAcct == 'c') "\nchecking" else "\nsavings") + "\nAccount: " + accountNumber +
    "\n" + "*" * 30
}

object BankAccount {
  var accountNum = 5000

  def nextAcctNum = {
    accountNum += 1
    accountNum
  }
}
