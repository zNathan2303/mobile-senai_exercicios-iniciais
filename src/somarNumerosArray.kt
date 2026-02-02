fun somarNumerosArray(array : Array<Int>) {
    var soma = 0
    for (numero in array) {
        soma += numero
    }
    println("O total da soma dos números do array é $soma")
}