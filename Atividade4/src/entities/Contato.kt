package entities

open class Contato(
    val nome: String,
    val idade: Int,
    val altura: Float,
    val genero: Char,
    val email: String,
    val endereco: Endereco
) : Imprimivel {
    override fun imprimir() {
        println("Nome: $nome, Idade: $idade, Altura: $altura, Gênero: $genero, Email: $email")
        endereco.imprimir()
    }
}
