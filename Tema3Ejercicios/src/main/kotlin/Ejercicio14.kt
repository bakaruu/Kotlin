//14. Implementa una función llamada encontrarPrimoMayorQue100 que utilice un bucle for para
//encontrar el primer número primo mayor que 100. Utiliza una declaración break para salir del
//bucle una vez que se encuentre el número primo.

fun encontrarPrimoMayorQue100(): Int {

    var esPrimo = true

    //doble for que recorre el valor maximo de los ENTEROS
    for (numero in 101..Int.MAX_VALUE) {
        var esPrimo = true

        //Otro for para comprobar si el numero actual tiene o no algun divisor mas que el mismo o 1
        //Si encuentra algun divisor mas, seteamos esPrimo a false y paramos la ejecucion y devolvemos -1 que es false
        for (i in 2 until numero) {
            if (numero % i == 0) {
                esPrimo = false
                break
            }
        }

        if (esPrimo) {
            return numero
        }
    }
    return -1
}