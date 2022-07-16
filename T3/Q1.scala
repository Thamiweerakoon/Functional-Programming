import scala.io.StdIn.readInt

object Q1 extends App{

    def area(r:Int)=math.Pi*r*r;

    printf("Enter Radius of the disk");
    var x=readInt();
    printf("Area of the disk = %f",area(x));
}