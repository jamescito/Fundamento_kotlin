/*class Persona{
    var nombre:String = ""
    var apellido:String = ""
    constructor(){
    }
    constructor(n:String, a:String):this()
    {
    nombre=n
    apellido=a
    }
   }
    */
   open class Persona(var nombre:String, var apellido:String)

   fun main(){
    var persona = Persona("Yesser","Miranda")
    var nueva = Persona("Juan","Lopez")
    //nueva.nombre = "Juan"
    //nueva.apellido = "Lopez"
    println(persona.nombre)
    println(nueva.nombre)
   }