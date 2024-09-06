package main

import entities.*

fun main() {

    val endereco1 = Endereco("Rua A", 123, "12345-678", "Cidade A", "Estado A")
    val endereco2 = Endereco("Rua B", 456, "87654-321", "Cidade B", "Estado B")


    val amigo1 = Amigo("João", 25, 1.75f, 'M', "joao@email.com", endereco1, "01/01/2020")
    val amigo2 = Amigo("Maria", 30, 1.65f, 'F', "maria@email.com", endereco2, "15/05/2019")


    val parente1 = Parente("Carlos", 40, 1.80f, 'M', "carlos@email.com", endereco1, "Primo")
    val parente2 = Parente("Ana", 35, 1.60f, 'F', "ana@email.com", endereco2, "Irmã")


    val contatos: List<Imprimivel> = listOf(amigo1, amigo2, parente1, parente2)
    contatos.forEach { it.imprimir() }
}
