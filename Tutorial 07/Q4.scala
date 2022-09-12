class Account(id:String,num:Int,bal:Double){
    val nic:String=id;
    val acn:Int=num;
    var cb:Double=bal;

    def transfer(x:Account,y:Double)={
        this.cb=this.cb-y;
        x.cb=x.cb+y;
    };

    def deposit(x:Double)=this.cb=this.cb+x;


    override def toString="["+nic+":"+acn+":"+cb+"]";
}

object Q4 extends App{
    val a1=new Account("1V",1,-100);
    val a2=new Account("2V",2,100);
    val a3=new Account("2V",2,100);
    
    var bank:List[Account]=List(a1,a2,a3);

    println(bank);

    val negative=(x:List[Account])=>x.filter(y=>y.cb<0);
    println(negative(bank));

    val sum=bank.reduce((a,b)=>Account("",0,a.cb+b.cb)).cb;
    println(sum);

    val interest=bank.map{x=>
        if(x.cb<0) (x.cb=x.cb+x.cb*0.1);
        else (x.cb=x.cb+x.cb*0.05);
    };

    println(bank);
}