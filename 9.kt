fun main() {
    // Ano atual
    val anoAtual = 2024

    // Lê o ano de nascimento do usuário
    print("Informe o seu ano de nascimento: ")
    val anoNascimento = readLine()?.toInt() // Lê o ano e tenta convertê-lo para Int

    // Verifica se a conversão foi bem-sucedida
    if (anoNascimento != null) {
        // Calcula a idade
        val idade = anoAtual - anoNascimento

        // Verifica se a pessoa pode votar
        if (idade >= 16) {
            println("Você pode votar este ano.")
        } else {
            println("Você não pode votar este ano.")
        }
    } else {
        println("Ano de nascimento inválido. Por favor, informe um número válido.")
    }
}
