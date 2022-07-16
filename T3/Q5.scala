object Q5 extends App{

    def easy(x:Int)=x*8;
    def tempo(x:Int)=x*7;
    def total()=easy(2)+tempo(3)+easy(2);
    
    printf("Total running time = %d min",total());
}