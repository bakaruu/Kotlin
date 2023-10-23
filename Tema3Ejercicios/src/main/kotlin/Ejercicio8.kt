//8. Utiliza una lista mutable para almacenar nombres de colores y elimina un color de la lista.


fun listaMut (colores: MutableList<String>, colorBorrar: String){

    colores.remove(colorBorrar)
}