import scala.io.StdIn.readInt

object Q3 extends App{

    def vol(r:Int)=math.Pi*r*r*r*4/3;

    printf("Enter Radius of the sphere:");
    var x=readInt();
    printf("Volume of the sphere = %f",vol(x));
}