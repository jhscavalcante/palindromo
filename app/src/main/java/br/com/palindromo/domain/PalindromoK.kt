package br.com.palindromo.domain

class PalindromoK (conteudo: String) {

    val conteudo: String = conteudo
        get() {
            return field.toLowerCase();
        }

    fun ehPalindromo(): Boolean {
        return conteudo == conteudo.reversed();
    }
}
