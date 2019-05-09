package com.example.livros.livros;

public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private int anoPub;
    private int imgResId;

    public static final Livro[] livros = {
            new Livro("Dom Casmurro", "Machado de Assis", "Livraria Garnier", 1899, R.drawable.domcasmurro),
            new Livro("Menino de Engenho", "José Lins do Rego", "José Olímpio", 1932, R.drawable.meninodeengenho),
            new Livro("O Cortiço", "Aluísio Azevedo", "Livraria Garnier", 1890, R.drawable.ocortico),
            new Livro("O Tempo e o Vento - O Continente", "Érico Veríssimo", "Editora Globo", 1949, R.drawable.otempoeovento),
            new Livro("Vidas Secas", "Graciliano Ramos", "José Olímpio", 1938, R.drawable.vidassecas)
    };

    private Livro(String nome, String autor, String editora, int anoPub, int imgResId) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.anoPub = anoPub;
        this.imgResId = imgResId;
    }

    public String toString() {
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public int getImgResId() {
        return imgResId;
    }
}
