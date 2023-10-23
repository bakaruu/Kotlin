//4. Crea una función llamada evaluarCalificacion que tome la calificación de un estudiante (un
//número entre 0 y 100) como argumento y devuelva una letra de calificación (A, B, C, D, F)
//utilizando una estructura when.


fun evaluarCalificacion(nota:Int): String {
    return when (nota) {
        in 90..100 -> "A"
        in 80 until 90 -> "B"
        in 70 until 80 -> "C"
        in 60 until 70 -> "D"
        in 0 until 60 -> "F"
        else -> "Calificacion no valida"

    }

}