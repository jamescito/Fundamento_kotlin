fun main()
{
    //while
    var i:Int=0
while (i<=5) {
    println("Esto se imprimirá por un largo tiempo!")
    i++
   }

 val array = arrayOf("a", "b", "c")
for (i in array.indices) {
 println(array[i])
}

for (i in 2 downTo 0 step 1) {
    println(array[i])
   }
      
   for (j in 0..2 ) {
    println(array[j])
   }
       
   
   

for (i in 6 downTo 0 step 2) {
 println(i)
}
   
//do while
var a:Int=0
do{
    println("soy do while")
    a++
}while (a <=3)

}

