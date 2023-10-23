//3. Implementa una función llamada esMayorQue10YMenorQue20 que tome dos números como
//argumentos y devuelva true si ambos números son mayores que 10 y menores que 20, y false en
//caso contrario.

fun esMayorQue10YMenorQue20(numero1: Int, numero2: Int): Boolean{

    if(numero1 > 10 && numero1 <20 && numero2 >10 && numero2 <20){

        return true
    }else{

        return false
    }
}