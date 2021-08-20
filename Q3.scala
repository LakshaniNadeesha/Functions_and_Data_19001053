object Q3 extends App{

  var account1 = new Account("996630420V", 145265896, 50000)
  var account2 = new Account("991631399V", 148754965, 24000)

  println("Accounts Details:")
  println("Account 1 ")
  println(account1)
  println()

  println("Account 2")
  println(account2)
  println()

  println("After transfer money(Rs.4000.00):")
  account1.transfer(account2,4000)
  println("Account 1")
  println(account1)
  println()
  println("Account 2")
  println(account2)


}

class Account (n: String, a: Int, b: Double){

  var nic = n
  var account_number = a
  var balance = b

  def transfer (ac:Account, bc: Double) = {
    this.balance = this.balance - bc
    ac.balance = ac.balance + bc
  }

  override def toString: String = "NIC:" + nic + "\n" + "Account Number:" + account_number + "\n" + "Balance:" + balance


}
