fun main(args: Array<String>) {

////Ejercicio1
//    if (esPar(3) == true) {
//        println("Es par")
//
//    } else {
//        println("Es impar")
//
//    }
//
////Ejercicio2
//
//    compararTexto("HolasD", "Holasf")


////Ejercicio3
//    if (esMayorQue10YMenorQue20(12, 19)){
//        println("Son mayores de 10 y menores de 20")
//
//    }else{
//        println("Alguno de los numeros es mayor de 20 o menor de 10")
//    }


//    //Ejercicio4
//    println(evaluarCalificacion(99))


//    //Ejercicio5
//    println(sumarNumeros(1,2,3,4,5,6))


//    //Ejercicio6
//    var array1= intArrayOf(1,2,3,4,5)
//    var array2 = invertirArray(array1)
//
//
////    for ((index, numero) in array2.withIndex()) {
////        print(numero)
////        if (index < array2.size - 1) {
////            print(", ")
////        }
////    }
//
//    for ((indice, elemento) in array2.withIndex()) {
//        println("El elemento en el índice $indice es: $elemento")
//    }

//    //Ejercicio7
//
//    var frutas = mutableListOf("Pera", "Naranja")
//
//    frutas.add("Uva")
//
//    println(frutas)


//    //Ejercicio8
//    var colores= mutableListOf("Azul", "Verde")
//
//    var colorBorrar = "Verde"
//    listaMut(colores, colorBorrar)
//
//    println(colores)


    //Ejercicio9

//    var array= intArrayOf(1,2,3,4,5)
//
//    imprimirNumeros(array)

    //Ejercicio10

//    var lista = listOf(1,2,3,4)
//
//    imprimirLista(lista)


    //Ejercicio11
//    imprimirNumerosHastaN(10)


    //Ejercicio12
//    imprimirNumerosPositivos()

    //Ejercicio13

//    val numero = 12
//    if (esPrimo(numero)) {
//        println("$numero es un número primo.")
//    } else {
//        println("$numero no es un número primo.")
//    }

    //Ejercicio14
    val primerPrimoMayorQue100 = encontrarPrimoMayorQue100()

    if (primerPrimoMayorQue100 != -1) {
        println("El primer número primo mayor que 100 es: $primerPrimoMayorQue100")
    } else {
        println("No se encontró ningún número primo mayor que 100.")
    }


}
