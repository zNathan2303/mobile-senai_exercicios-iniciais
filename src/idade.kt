fun idade(idade: Int) {
    if (idade in 1..12) {
        println("Criança")
    } else if (idade in 12 .. 17 ){
        println("Adolescente")
    } else if (idade in 18 .. 59) {
        println("Adulto")
    } else if (idade > 60) {
        println("Idoso")
    }
}