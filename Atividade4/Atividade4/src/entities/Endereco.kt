package entities

class Endereco(
    val rua: String,
    val numero: Int,
    val cep: String,
    val cidade: String,
    val estado: String
) : Imprimivel {
    override fun imprimir() {
        println("Endereço: $rua, $numero, $cep, $cidade, $estado")
    }
}
