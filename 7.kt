fun main() {
    // Criação de uma lista para armazenar os números informados
    val numeros = mutableListOf<Int>()
    var soma = 0 // Variável para armazenar a soma dos números menores que 72

    // Laço para receber 6 números do usuário
    for (i in 1..6) {
        print("Informe o $i° número: ")
        val numero = readLine()?.toInt() // Lê o número e tenta convertê-lo para Int

        if (numero != null) { // Verifica se a conversão foi bem-sucedida
            numeros.add(numero) // Adiciona o número à lista
            if (numero < 72) { // Verifica se o número é menor que 72
                soma += numero // Soma o número à variável soma
            }
        }
    }

    // Exibindo os números informados e a soma dos números menores que 72
    println("Números informados: $numeros")
    println("Soma dos números menores que 72: $soma")
}