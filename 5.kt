fun main() {
    // Criar uma lista para armazenar os 6 números informados
    val numeros = mutableListOf<Double>()

    // Ler os 6 números informados pelo usuário
    for (i in 1..6) {
        print("Informe o valor $i: ")
        val numero = readLine()!!.toDouble()
        numeros.add(numero)
    }

    // Exibir os números informados
    println("Os números informados foram: $numeros")

    // Calcular a média aritmética
    val media = numeros.sum() / numeros.size

    // Exibir a média aritmética
    println("A média aritmética dos números é: $media")
}
