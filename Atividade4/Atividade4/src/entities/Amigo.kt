package entities

class Amigo(
    nome: String,
    idade: Int,
    altura: Float,
    genero: Char,
    email: String,
    endereco: Endereco,
    val conhecidoEm: String
) : Contato(nome, idade, altura, genero, email, endereco) {
    override fun imprimir() {
        super.imprimir()
        println("Conhecido em: $conhecidoEm")
    }
}
