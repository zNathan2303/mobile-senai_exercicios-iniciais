fun idade(idade: Int) {
    when (idade) {
        in 0..11 -> println("Criança")
        in 12 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        else -> if (idade > 59) println("Idoso") else println("Idade invalida")
    }
}