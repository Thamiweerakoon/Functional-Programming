import scala.io.StdIn.readInt

object Q4{

    def count(price:Int)=120+(15-price)/5*20
    def income(price:Int)=count(price)*price
    def cost(price:Int)=500+count(price)*3
    def profit(price:Int)=income(price)-cost(price)
    
    def main(args:Array[String])={

        printf("Enter price of a ticket:");
        var x=readInt();

        printf("%d",profit(x));
    }
}