import scala.io.StdIn.readDouble;

object Q1 extends App{

    def calintereset(deposit:Double):Double=deposit match{
        case x if x<0 => 0;
        case x if x<20000 => x*0.02;
        case x if x<200000 => x*0.04;
        case x if x<2000000 => x*0.035;
        case x if x>2000000 => x*0.065;
    }

    print("Enter deposit amount: ");
    var x=readDouble();
    print("Interest: "+calintereset(x));
}