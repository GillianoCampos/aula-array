package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "8000".toBigDecimal()
    )

    println(salarios.somatoria())

    println(salarios.media())
}
