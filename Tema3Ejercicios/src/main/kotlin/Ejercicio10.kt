///10. Define una función llamada imprimirLista que tome una lista de números como argumento y
//utilice un bucle forEach para imprimir cada número en la lista.

fun imprimirLista(numeros: List<Int>){

    //Si queremos que sea un nombre mas descriptivo, si no ponemos el (it)
    numeros.forEach{Iterador ->
        print("$Iterador ")

    }

}