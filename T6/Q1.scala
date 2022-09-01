object Q1 extends App{

    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    val Ec=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper+key)%a.size));

    val Dc=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper-key)%a.size));

    val caesarCipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a));

    val ct=caesarCipher(Ec,"S",5,alphabet);
    println(ct);

    val pt=caesarCipher(Dc,ct,5,alphabet);
    println(pt);
  
} 