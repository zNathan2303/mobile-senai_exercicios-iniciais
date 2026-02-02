fun somarParesArray(array : Array<Int>): Int {
    var soma = 0
    for (numero in array) {
        if (numero % 2 == 0) {
            soma += numero
        }
    }
    return soma
}