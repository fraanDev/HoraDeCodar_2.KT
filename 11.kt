fun main() {
    // Lê o primeiro valor inteiro
    print("Informe o primeiro valor inteiro: ")
    val valor1 = readLine()?.toInt() // Lê e tenta converter para Int

    // Lê o segundo valor inteiro
    print("Informe o segundo valor inteiro: ")
    val valor2 = readLine()?.toInt() // Lê e tenta converter para Int

    // Lê a operação a ser realizada
    println("Escolha a operação: ")
    println("1. Adição")
    println("2. Subtração")
    println("3. Divisão")
    println("4. Multiplicação")
    print("Informe o número da operação: ")
    val operacao = readLine()?.toInt() // Lê e tenta converter para Int

    // Verifica se as entradas foram bem-sucedidas
    if (valor1 != null && valor2 != null && operacao != null) {
        when (operacao) {
            1 -> {
                // Adição
                val resultado = valor1 + valor2
                println("Resultado da adição: $resultado")
            }
            2 -> {
                // Subtração
                val resultado = valor1 - valor2
                println("Resultado da subtração: $resultado")
            }
            3 -> {
                // Divisão
                if (valor2 != 0) { // Verifica se o denominador não é zero
                    val resultado = valor1 / valor2
                    println("Resultado da divisão: $resultado")
                } else {
                    println("Erro: Divisão por zero não é permitida.")
                }
            }
            4 -> {
                // Multiplicação
                val resultado = valor1 * valor2
                println("Resultado da multiplicação: $resultado")
            }
            else -> {
                println("Operação inválida! Escolha entre 1, 2, 3 ou 4.")
            }
        }
    } else {
        println("Entrada inválida. Por favor, informe números inteiros válidos.")
    }
}
