//13. Define una función llamada esPrimo que tome un número como argumento y devuelva true
//si es primo y false si no lo es. Utiliza una declaración return para salir de la función una vez que
//se determine si el número es primo.

fun esPrimo(numero:Int):Boolean{
    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }
    return true

}