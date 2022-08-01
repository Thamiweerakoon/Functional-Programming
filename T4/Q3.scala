object Q3 extends App{

    def toUpper(str:String):String=str.toUpperCase();
    def toLower(str:String):String=str.toLowerCase();
    def formatNames(name:String)(id:Int*)(function:String=>String):String={
        if(id.isEmpty){
            return function(name);
        }else{
            var text="";
            var j=0;
            while(j<name.length()){
                if(id.contains(j)){
                    text=text+function(name.charAt(j).toString);
                }else{
                    text=text+name.charAt(j).toString;
                }
                j+=1;
            }
            return text;
        }
        
    };

    println(formatNames("Benny")()(toUpper));
    println(formatNames("Niroshan")(0)(toUpper));
    println(formatNames("Saman")()(toLower));
    println(formatNames("Kumara")(5)(toUpper));
}