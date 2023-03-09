import io.kotest.core.spec.style.DescribeSpec

class DadoTest: DescribeSpec({
    describe("Generar un dado") {
        it("que tiene 4 caras") {
            val dado = Dado()
            dado.generarDado(4)
        }
        it("que tiene 6 caras") {
            val dado = Dado()
            dado.generarDado(6)
        }
        it("que tiene 8 caras") {
            val dado = Dado()
            dado.generarDado(8)
        }
        it("que tiene 10 caras") {
            val dado = Dado()
            dado.generarDado(10)
        }
        it("que tiene 12 caras") {
            val dado = Dado()
            dado.generarDado(12)
        }
        it("que tiene 20 caras") {
            val dado = Dado()
            dado.generarDado(20)
        }
    }
})