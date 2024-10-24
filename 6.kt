fun main() {
    // Criação de uma lista para armazenar os valores
    val valores = mutableListOf<Int>()

    // Laço para receber os 4 valores do usuário
    for (i in 1..4) {
        print("Informe o $i° valor: ")
        val valor = readLine()?.toInt() // Lê o valor digitado e o converte para Int
        if (valor != null) { // Verifica se a conversão foi bem-sucedida
            valores.add(valor) // Adiciona o valor à lista
        }
    }

    // Obtendo o primeiro, último e o maior valor
    val primeiro = valores[0] // O primeiro valor da lista
    val ultimo = valores[3] // O último valor da lista
    val maior = valores.maxOrNull() // O maior valor da lista

    // Exibindo os resultados
    println("Primeiro valor: $primeiro")
    println("Último valor: $ultimo")
    println("Maior valor: $maior")
}
