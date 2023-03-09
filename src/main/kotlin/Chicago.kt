class Chicago: Juego {

    override fun jugar(j1: String, j2: String, carasDados: Int): String {
        val dados = listOf(6)

        if (carasDados in dados) {
            val dado_1 = Dado().generarDado(carasDados)
            val dado_2 = Dado().generarDado(carasDados)

            var puntos_j1 = 0
            var puntos_j2 = 0

            var puntosObjetivo = 1

            for (ronda in 1..11) {
                puntosObjetivo += ronda

                val num_1_j1 = dado_1.random()
                val num_2_j1 = dado_2.random()
                val dados_j1 = mutableListOf(num_1_j1, num_2_j1)

                val num_1_j2 = dado_1.random()
                val num_2_j2 = dado_2.random()
                val dados_j2 = mutableListOf(num_1_j2, num_2_j2)

                var mensaje = ""
                when (puntosObjetivo) {
                    dados_j1.sum() and dados_j2.sum() -> {
                        mensaje = "RONDA $ronda: Ambos puntuan."
                        puntos_j1 =+ 1
                        puntos_j2 =+ 1
                    }
                    dados_j1.sum() -> {
                        mensaje = "RONDA $ronda: Gana $j1."
                        puntos_j1 =+ 1
                    }
                    dados_j2.sum() -> {
                        mensaje = "RONDA $ronda: Gana $j2."
                        puntos_j2 = +1
                    }
                    else -> {
                        mensaje = "RONDA $ronda: Nadie gana."
                    }
                }
                println(mensaje)
            }

            println("")
            println("Puntuacion $j1: $puntos_j1")
            println("Puntuacion $j2: $puntos_j2")

            val ganador = when {
                puntos_j1 > puntos_j2 -> {
                    "Resultado: Ganador $j1"
                }

                puntos_j2 > puntos_j1 -> {
                    "Resultado: Ganador $j2"
                }

                else -> {
                    "Resultado: Emapte"
                }
            }

            return ganador
        } else {
            return "Para jugar a Chicago es necesario usar un dado de 6 caras."
        }
    }
}
