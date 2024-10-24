fun main() {
    // Pedir os três números ao usuário
    print("Informe o primeiro número: ")
    val numero1 = readLine()!!.toDouble()

    print("Informe o segundo número: ")
    val numero2 = readLine()!!.toDouble()

    print("Informe o terceiro número: ")
    val numero3 = readLine()!!.toDouble()

    // Verificar qual é o maior número
    val maior = if (numero1 > numero2 && numero1 > numero3) {
        numero1
    } else if (numero2 > numero1 && numero2 > numero3) {
        numero2
    } else {
        numero3
    }

    // Exibir o maior número
    println("O maior número é: $maior")
}
