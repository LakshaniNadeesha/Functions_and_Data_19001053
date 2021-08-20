object Q2 extends App{

  val x = new RationalSub(3,4)
  val y = new RationalSub(5,8)
  val z = new RationalSub(2,7)

  val answer = x-y-z

//  println(x)
//  println(y)
//  println(z)
  println(answer)

}

class RationalSub (x: Int, y: Int){

  def numerator = x
  def denominator = y

  def + (r: RationalSub) = new RationalSub(this.numerator * r.denominator + r.numerator * this.denominator, this.denominator * r.denominator)

  def neg = new RationalSub(-this.numerator, this.denominator)

  def - (r: RationalSub) = this + r.neg

  override def toString: String = numerator + "/" + denominator

}
