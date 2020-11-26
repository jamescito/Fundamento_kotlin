open class Persona(var nombre:String, var apellido:String)
class Estudiante(nombre:String, apellido:String,
var asignatura:String,
 var profesor:String):
 Persona(nombre,apellido)


fun main(){

    var estudiante= Estudiante("James","reyes","android","yesser")
println("asignatura ${estudiante.asignatura} con ${estudiante.nombre}")
}