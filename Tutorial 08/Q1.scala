case class Point(a:Double,b:Double){
    def x:Double=a;
    def y:Double=b;

    def +(p:Point)=Point(this.x+p.x,this.y+p.y);

    def move(p:Int,q:Int)=Point(this.x+p,this.y+q);

    def distance(p:Point):Double=scala.math.hypot((this.x-p.x),(this.y-p.y));

    def invert()=Point(this.y,this.x);
}

object Q1 extends App{
    val p1=Point(1,2);
    val p2=Point(3,4);
    val p3=p1+p2;
    val p4=Point(8,12);
    val p5=Point(2,4);
    
    print("Addition of p1 and p2: ");
    println(p3);
    println();

    print("Move p3 by dx=6 dy=4: ");
    println(p3.move(6,4));
    println();

    print("Distance between p4 and p5: ");
    println(p4.distance(p5));
    println();

    print("Switch x and y cordinates of p4: ");
    println(p4.invert());
}