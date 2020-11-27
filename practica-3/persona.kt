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
    var persona1 = Persona("Juan","Lopez")
    var persona2= Persona("Maria","Magdalena")
    //nueva.nombre = "Juan"
    //nueva.apellido = "Lopez"
    //Lista de persona 
    var lista_personas = ArrayList<Persona>()
    lista_personas.add(persona)
    lista_personas.add(persona1)
    lista_personas.add(persona2)

    for(i in 0.. 2)
    {
        println("${lista_personas[i].nombre}${lista_personas[i].apellido}")
       
    }
   }