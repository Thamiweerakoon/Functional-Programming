class Account(id:String,num:Int,bal:Double){
    val nic:String=id;
    val acn:Int=num;
    var cb:Double=bal;

    def transfer(x:Account,y:Double)={
        this.cb=this.cb-y;
        x.cb=x.cb+y;
    };

    override def toString="["+nic+":"+acn+":"+cb+"]";
}

object Q3 extends App{
    val a1=new Account("1V",1,100);
    val a2=new Account("2V",2,100);
    println(a1);
    println(a2);
    a1.transfer(a2,50.0);
    println(a1);
    println(a2);
}