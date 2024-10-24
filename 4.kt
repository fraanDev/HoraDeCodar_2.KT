fun main() {
    // Pedir os três números ao usuário
    print("Informe o primeiro número: ")
    val numero1 = readLine()!!.toDouble()

    print("Informe o segundo número: ")
    val numero2 = readLine()!!.toDouble()

    print("Informe o terceiro número: ")
    val numero3 = readLine()!!.toDouble()

    // Variável para armazenar a soma dos dois maiores
    val somaDoisMaiores = if (numero1 > numero2 && numero1 > numero3) {
        // Se o número 1 for o maior, somamos ele com o maior entre os outros dois
        numero1 + if (numero2 > numero3) numero2 else numero3
    } else if (numero2 > numero1 && numero2 > numero3) {
        // Se o número 2 for o maior, somamos ele com o maior entre os outros dois
        numero2 + if (numero1 > numero3) numero1 else numero3
    } else {
        // Se o número 3 for o maior, somamos ele com o maior entre os outros dois
        numero3 + if (numero1 > numero2) numero1 else numero2
    }

    // Exibir a soma dos dois maiores números
    println("A soma dos dois maiores números é: $somaDoisMaiores")
}
