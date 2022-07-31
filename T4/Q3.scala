object Q3 extends App{

    def toUpper(str:String):String=str.toUpperCase();
    def toLower(str:String):String=str.toLowerCase();
    def formatNames(name:String)(function:String=>String):String={
        function(name);
    };

    println(formatNames("Benny")(toUpper(_)));
    println(formatNames("Saman")(toLower(_)));
}