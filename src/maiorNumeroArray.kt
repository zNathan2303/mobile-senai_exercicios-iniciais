fun maiorNumeroArray(array : Array<Int>) {
    var maiorNumero = 0
    for (numero in array) {
        if (numero > maiorNumero) {
            maiorNumero = numero
        }
    }
    println("O maior número do array é $maiorNumero")
}