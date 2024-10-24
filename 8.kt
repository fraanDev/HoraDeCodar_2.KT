fun main() {
    // Variável para armazenar a soma dos números válidos
    var soma = 0.0
    // Contador para os números válidos
    var contador = 0

    // Laço para receber 4 números do usuário
    for (i in 1..4) {
        print("Informe o $i° número: ")
        val numero = readLine()?.toDouble() // Lê o número e tenta convertê-lo para Double

        if (numero != null && numero > 0 && numero < 10) { // Verifica se o número é válido
            soma += numero // Soma o número à variável soma
            contador++ // Aumenta o contador de números válidos
        } else {
            println("Número inválido! Informe um número maior que 0 e menor que 10.")
        }
    }

    // Verifica se existem números válidos para calcular a média
    if (contador > 0) {
        val media = soma / contador // Calcula a média
        println("A média é: $media") // Exibe a média

        // Verifica se a média é maior que 5
        if (media > 5) {
            println("Você passou no teste")
        } else {
            println("Tente novamente")
        }
    } else {
        println("Nenhum número válido foi informado para calcular a média.")
    }
}
