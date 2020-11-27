fun main()
{
    //numeros
val int = 123
val long = 123456L
val double = 12.34
val float = 12.34F
val hexadecimal = 0xAB
val binary = 0b01010101


println("$int $long $double $float $hexadecimal $binary")

//conversiones
var ent=123
var flotante = ent.toFloat()
println("el flotante es:$flotante")

var flo=12.34
var entero= flo.toInt()
println("el flotante es:$entero")


//booleanos
val x = 1
val y = 2
val z = 2
val esTrue = x < y && x < z
val otroTrue = x == y || y == z
println("$x $y $z $esTrue $otroTrue")

//ejemplo char
 var char="a"
 var ch="b"
 var verdadero= char!=ch
 println("son diferente las variables $verdadero")

 //
 val string = "string con \n una línea nueva"

val rawString ="""
raw string es útil para
 cadenas con muchas líneas
 """

 println ("$string $rawString")
}

