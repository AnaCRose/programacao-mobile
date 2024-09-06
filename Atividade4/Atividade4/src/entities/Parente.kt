package entities

class Parente(
    nome: String,
    idade: Int,
    altura: Float,
    genero: Char,
    email: String,
    endereco: Endereco,
    val parentesco: String
) : Contato(nome, idade, altura, genero, email, endereco) {
    override fun imprimir() {
        super.imprimir()
        println("Parentesco: $parentesco")
    }
}
