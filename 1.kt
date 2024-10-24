fun main() {
    // Pedir o primeiro número
    print("Informe o primeiro número: ")
    val numero1 = readLine()!!.toDouble()

    // Pedir o segundo número
    print("Informe o segundo número: ")
    val numero2 = readLine()!!.toDouble()

    // Comparar os números e exibir o maior
    if (numero1 > numero2) {
        println("O maior número é: $numero1")
    } else if (numero2 > numero1) {
        println("O maior número é: $numero2")
    } else {
        println("Os números são iguais.")
    }
}
