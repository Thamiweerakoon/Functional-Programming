import scala.io.StdIn.readInt

object Q4{

    def wage(hours:Int)=hours*250
    def ot(hours:Int)=hours*85
    def grosspay(x:Int,y:Int)=wage(x)+ot(y)
    def tax(gp:Int):Double=gp*0.12
    def netpay(x:Int,y:Int):Double=grosspay(x,y)-tax((grosspay(x,y)))

    def main(args:Array[String])={

        printf("Enter working hours:");
        var x=readInt();
        printf("Enter ot hours:");
        var y=readInt();

        printf("%f",netpay(x,y));
    }
}
