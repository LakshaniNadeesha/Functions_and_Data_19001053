object Q4 extends App {

  var bank:List[AccountDetails]=List()

  //List of Accounts with negative balances
  val overdraft=(b:List[AccountDetails])=> b.filter(x=>x.balance<0)

  //Calculate the sum of all account balances
  val Balance = ( b: List[AccountDetails] ) => b.map( x => (x.balance,1) ).reduce( (y , z) => ( y._1 + z._1 , y._2 + z._2) )

  /*4.3 Calculate the final balances of all accounts after apply the interest function as fallows:
  If balance is positive, deposit interest is .05  and if balance is negative, overdraft interest is .1 */
  val interest = ( b : List[AccountDetails] ) => b.map( x => {
    x.balance match {
      case a if a >= 0 => x.balance + (x.balance * 0.05)
      case _ => Math.abs(x.balance) * 0.1 + x.balance
    }
  }
  )

  var person1 = new AccountDetails("996630420V", 126589, 2000)
  var person2 = new AccountDetails("991631399V", 125526, -1000)
  var person3 = new AccountDetails("991245852V", 12452, 5000)


  bank = List(person1,person2,person3)
  print("List of accounts : ")
  println(bank)

  print("List of accounts with negative balances : ")
  println(overdraft(bank))
  print("Sum of all account balances, Number of accounts : ")
  println(Balance(bank))
  print("Final balances of all accounts after apply the interest : ")
  println(interest(bank))
}

class AccountDetails(id:String,n: Int, b: Double) {
  val nic = id
  val account_number = n
  var balance = b

  override def toString = "["+nic+":"+account_number +":"+ balance+"]"

}
