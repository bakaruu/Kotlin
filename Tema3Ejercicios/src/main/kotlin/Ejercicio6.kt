//6. Implementa una función llamada invertirArray que tome un array de números como
//argumento y devuelva un nuevo array con los elementos en orden inverso.

fun invertirArray(array: IntArray): IntArray {

    val long = array.size
    val newArray = IntArray(long)

    for (posi in 0 until long) {
        newArray[posi] = array[long - posi -1]

    }



    return newArray
}