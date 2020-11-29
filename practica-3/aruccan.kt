class Universidad(var nombre: String,var recinto: String, var direccion: String)
class Estudiante( var nombre: String,var apellido: String,var cedula: String,var edad: Int,var año_cursando: String,var profesor: String)
class Profesor(var nombre: String,var apellido: String,var cedula: String,var edad: Int,var faculta: String,var cantidad_asignatura: String)
class Administrativo(var nombre: String,var apellido: String,var cedula: String,var edad: Int,var area_trabajo: String,var jefe_inmediato: String)

 fun main(){
    var univer = Universidad("URACCAN","Las_minas","Pedro_juaquin")
    var univer1 = Universidad("URACCAN","Bilwi","No se la direccion xs")
   var estu = Estudiante("James","Reyes","610-230500-1004H", 20, "4to" , "Yesser")
   var estu1 = Estudiante("Henry","Diaz","610-230500-1004H", 20, "4to" , "Yesser")
    var pro = Profesor("Yesser","Miranda","610-230500-1004H", 24, "Ingenieria" , "5 clases")
    var pro1 = Profesor("Elkis","Ortega","610-230500-1004H", 28, "Ingenieria" , "2 clases")
    var adm = Administrativo("Maria","Miranda","610-230500-1004H", 30, "Administracion" , "Pablo Cortez")
    var adm1 = Administrativo("Mario","lagos","610-230500-1004H", 35, "Administracion" , "Pablo Cortez")
     
    //////////////Listas///////////////
    var lista_uraccan = ArrayList<Universidad>()
    lista_uraccan.add(univer)
    lista_uraccan.add(univer1)
    /////////////////////////////////////////////  
   var lista_estudiante = ArrayList<Estudiante>()
    lista_estudiante.add(estu)
    lista_estudiante.add(estu1)
    ////////////////////////////////////////////
    var lista_profe = ArrayList<Profesor>()
    lista_profe.add(pro)
    lista_profe.add(pro1)
    /////////////////////////////////////////////
    var lista_administrativo = ArrayList<Administrativo>()
    lista_administrativo.add(adm)
    lista_administrativo.add(adm1)
 
    for(i in 0 .. 1)
    {
      println("La Universidad es: ${lista_uraccan[i].nombre} ${lista_uraccan[i].recinto} ${lista_uraccan[i].direccion}")
            
    }
    for(i in 0 .. 1)
    {
      println("Los Estudiante son: ${lista_estudiante[i].nombre} ${lista_estudiante[i].apellido} ${lista_estudiante[i].cedula} ${lista_estudiante[i].edad} ${lista_estudiante[i].año_cursando} ${lista_estudiante[i].profesor}") 
    }
    
    for(i in 0 .. 1)
    {      
      println("Los Profesores son: ${lista_profe[i].nombre} ${lista_profe[i].apellido} ${lista_profe[i].cedula} ${lista_profe[i].edad} ${lista_profe[i].faculta} ${lista_profe[i].cantidad_asignatura}")
 
    }
    
    for(i in 0 .. 1)
    {      
      println("Los Administrativos son: ${lista_administrativo[i].nombre} ${lista_administrativo[i].apellido} ${lista_administrativo[i].cedula} ${lista_administrativo[i].edad} ${lista_administrativo[i].area_trabajo} ${lista_administrativo[i].jefe_inmediato}")
    }
    
}