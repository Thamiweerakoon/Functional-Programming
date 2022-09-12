class Rational(x:Int,y:Int){
    def numer=x;
    def denom=y;

    def neg=new Rational(-this.numer,this.denom);

    override def toString=numer+"/"+denom;
}

object Q1 extends App{
    val n1=new Rational(1,2);
    println(n1);
    println(n1.neg);
}


