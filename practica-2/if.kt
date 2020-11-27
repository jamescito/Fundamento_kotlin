import java.util.date


fun main ()
{
    val fecha = Date()
val hoy = if (fecha.year == 2019) true else false

    
    
    
    
    print("Ingrese una edad")
    val edad = readLine()?.toInt() as Int
if(edad >= 20)
{
 println("eres mayor de edad")
} else {
 println("aun eres menor")
}



}