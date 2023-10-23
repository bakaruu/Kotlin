//2. Crea una función llamada compararTexto que tome dos cadenas de texto como argumentos y
//determine si son iguales utilizando tanto equals() como el operador ==.


fun compararTexto(cadena1: String, cadena2: String){

    if (cadena1.equals(cadena2)){
        println("Son iguales (utilizando el .equals)")

    }else{
        println("No son iguales (utilizando el .equals)")
    }

    if (cadena1==cadena2){
        println("Son iguales (utilizando el ==)")

    }else{
        println("No son iguales (utilizando el ==)")
    }



}