package Ejercicios

class Ejercicio2 {
}
fun sumarLista(num: Array<Int> , operacion:(Int)->Int): Array<Int> {
    for (posicion in 0..num.size-1){
        num.set(posicion,operacion(num.get(posicion)))
        println(num.get(posicion))
    }
    return num
}
fun sumar(num: Int): Int{
    return num+10
}
 fun main() {
     val numeros = arrayOf<Int>(1,2,3,4,5,6,7,8,9);
     sumarLista(numeros, ::sumar)
 }

