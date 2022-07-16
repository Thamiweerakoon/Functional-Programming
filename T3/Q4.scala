import scala.io.StdIn.readInt

object Q4 extends App{

    def price(x:Int):Double=x*24.95;
    def discount(value:Double):Double=value*0.4;
    def shippingFee(x:Int):Double=50*3+(x-50)*0.75;
    def totalcost(x:Int)=price(x)-discount(price(x))+shippingFee(x);

    printf("Enter Number of books:");
    var x=readInt();
    printf("Total Wholesale Cost = %f",totalcost(x));
}