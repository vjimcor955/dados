class Dado {

    fun generarDado(lados: Int): MutableList<Int> {

        var i = 1
        var numeros = mutableListOf<Int>()

        while (i <= lados) {
            numeros.add(i)
            i += 1
        }

        return numeros
    }
}
