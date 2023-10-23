//5. Define una función llamada sumarNumeros que tome un número variable de argumentos
//utilizando vararg y devuelva la suma de todos los números.


//nombre del array dinamico

fun sumarNumeros(vararg numeros: Int): Int {
    var suma = 0
    for (numero in numeros){
        suma+=numero

    }
    return suma
}


