class Rational(x: Int, y: Int = 3) {
  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y) // g will hold the GCD of the numerator and the denominator

  def this(x: Int) = this(x, 1)

  def numer = x
  def denom = y

  def + (that: Rational): Rational = {
    new Rational(numer * that.denom + denom * that.numer,
      denom * that.denom)
  }

  def unary_-(): Rational = {
    new Rational(-numer, denom)
  }

  def - (that: Rational) = this + (-that)

  override def toString: String = {
    numer + "/" + denom
  }

  // implement the following two methods
  // less - check whether the rational is less than another rational
  //    def less(that: Rational): Boolean = { ??? }
  // max - find max among two rationals
  //    def max(that: Rational): Rational = { ??? }

}

def addRationals(a: Rational, b: Rational): Rational = {
  new Rational(a.numer * b.denom + a.denom * b.numer,
    a.denom * b.denom)
}

val xxy = new Rational(2)

val x: Rational = new Rational(3, 4)
val z: Rational = new Rational(4, 5)

println(x)
x.numer
x.denom

val j = new Rational(3, 4)
j.numer
j.denom


val y = addRationals(x, z)
y.numer
y.denom

x + x

object Rational {
  private val k = 34
}


object Car {
  val name = "City"
  val price = 1000000
  val engineCC = 1.3

  override def toString: String = {
    name + ", " + price + ", " + engineCC
  }

  def addCompanyName(company: String): String = company + " " + name
}

Car.addCompanyName("Honda")

object StringUtils {
  val url = "http://"
  def a = "" +
    ""
  def b = ""

}

StringUtils.url

