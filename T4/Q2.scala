import scala.io.StdIn.readInt;

object Q2 extends App{

    def patternMatching(num:Int):String=num match{
        case x if x<=0 => "Negative/Zero";
        case x if x%2==0 => "Even Number";
        case x if x%2!=0 => "Odd Number";
    }

    print("Enter an Integer: ");
    var x=readInt();
    print(patternMatching(x));
}