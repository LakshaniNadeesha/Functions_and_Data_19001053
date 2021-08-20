object Q1 extends App{

  val x = new Rational(2,3)
  println(x)
  println(x.neg)

}

class Rational (x: Int, y: Int){

  def numerator = x
  def denominator = y

  def neg = new Rational(-this.numerator, this.denominator)

  override def toString: String = numerator + "/" + denominator

}

