package com.example.preferiacomerissoaoestarnocdnoite;

import java.util.ArrayList;
import java.util.List;

public class Noticia {
    private int id;
    private String titulo;
    private int imagem;
    private String data;
    private String texto;
    private String localizacao;
    private String redeSocial;

    public Noticia(int id, String titulo, int imagem, String data, String texto, String localizacao, String redeSocial) {
        this.id = id;
        this.titulo = titulo;
        this.imagem = imagem;
        this.data = data;
        this.texto = texto;
        this.localizacao = localizacao;
        this.redeSocial = redeSocial;
    }

    public static List<Noticia> inicializar() {
        Noticia hamburgueria = new Noticia(
                1,
                "Nova Hamburgueria",
                R.drawable.hamburguer,
                "01/01/2022",
                "Uma nova proposta de hamburgueria apaareceu na cidade, apostando em uma borda diferente assim são feiras as novas hamburguerias.Uma nova proposta de hamburgueria apaareceu na cidade, apostando em uma borda diferente assim são feiras as novas hamburguerias.",
                "Bairro Hamb",
                "@hamb"
        );

        Noticia pizzaria = new Noticia(
                2,
                "Nova Pizzaria",
                R.drawable.pizza,
                "01/01/2022",
                "Uma nova proposta de pizza apaareceu na cidade, apostando em uma borda diferente assim são feiras as novas pizzas.Uma nova proposta de pizza apaareceu na cidade, apostando em uma borda diferente assim são feiras as novas pizzas.",
                "Bairro Pizz",
                "@pizz"
        );

        Noticia doceria = new Noticia(
                3,
                "Nova Doceria",
                R.drawable.pizza,
                "01/01/2022",
                "Uma nova proposta de doceria apaareceu na cidade, apostando em uma borda diferente assim são feiras as novas docerias.Uma nova proposta de doceria apaareceu na cidade, apostando em uma borda diferente assim são feiras as novas docerias.",
                "Bairro Doc",
                "@doc"
        );

        List<Noticia> noticias = new ArrayList<>();
        noticias.add(hamburgueria);
        noticias.add(pizzaria);
        noticias.add(doceria);

        return noticias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }
}


