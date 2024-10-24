fun main() {
    // Pedir o número ao usuário
    print("Informe um número: ")
    val numero = readLine()!!.toDouble()

    // Verificar se o número é positivo, negativo ou zero
    if (numero > 0) {
        println("O número $numero é positivo.")
    } else if (numero < 0) {
        println("O número $numero é negativo.")
    } else {
        println("O número é zero.")
    }
}
