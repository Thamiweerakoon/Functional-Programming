import scala.io.StdIn.readInt

object Q2 extends App{

    def fah(cel:Double)=cel*1.8+32.0;

    printf("Enter temperature in celcius:");
    var x=readInt();
    printf("Temperature in fahrenheit = %f",fah(x));
} 