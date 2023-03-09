import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.string.shouldMatch

class ChicagoTest: DescribeSpec ({
    describe("Crear una partida de Chicago") {
        it("sin especificar el dado") {
            val chicago = Chicago()
            chicago.jugar_chicago("Victor", "Jorge")
        }
        it("especificando el dado correcto que debe usarse") {
            val chicago = Chicago()
            chicago.jugar_chicago("Victor", "Jorge", 6)
        }
        it("intentando usar un dado incorrecto") {
            val chicago = Chicago()
            chicago.jugar_chicago("Victor", "Jorge", 12).shouldMatch("Para jugar a Chicago es necesario usar un dado de 6 caras.")
        }
    }
})
