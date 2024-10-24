fun main() {
    // Lê a altura da pessoa
    print("Informe a sua altura em metros: ")
    val altura = readLine()?.toDouble() // Lê a altura e tenta convertê-la para Double

    // Lê o gênero da pessoa
    print("Informe seu gênero (1 para feminino, 2 para masculino): ")
    val genero = readLine()?.toInt() // Lê o gênero e tenta convertê-lo para Int

    // Verifica se as entradas foram bem-sucedidas
    if (altura != null && genero != null) {
        val pesoIdeal: Double

        // Calcula o peso ideal com base no gênero
        if (genero == 1) {
            // Fórmula para mulheres
            pesoIdeal = (62.1 * altura) - 44.7
            println("O peso ideal para mulheres com altura $altura m é: %.2f kg".format(pesoIdeal))
        } else if (genero == 2) {
            // Fórmula para homens
            pesoIdeal = (72.7 * altura) - 58
            println("O peso ideal para homens com altura $altura m é: %.2f kg".format(pesoIdeal))
        } else {
            println("Gênero inválido! Por favor, informe 1 para feminino ou 2 para masculino.")
        }
    } else {
        println("Entrada inválida. Por favor, informe um número válido para altura e gênero.")
    }
}
