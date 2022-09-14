package com.example.preferiacomerissoaoestarnocdnoite;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivityJava extends AppCompatActivity implements View.OnClickListener {

    private List<Noticia> lista = Noticia.inicializar();
    private int index = 0;
    private final ViewHolder viewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewHolder.btnAnt = findViewById(R.id.btnAnt);
        viewHolder.btnProx = findViewById(R.id.btnProx);
        viewHolder.imagem = findViewById(R.id.imageView);
        viewHolder.titulo = findViewById(R.id.titulo);
        viewHolder.texto = findViewById(R.id.DescricaoImagem);
        viewHolder.data = findViewById(R.id.data);
        viewHolder.localizacao = findViewById(R.id.localizacao);
        viewHolder.redeSocial = findViewById(R.id.redeSocial);

        viewHolder.imagem.setImageResource(lista.get(index).getImagem());
        viewHolder.titulo.setText(lista.get(index).getTitulo());
        viewHolder.texto.setText(lista.get(index).getTexto());
        viewHolder.redeSocial.setText(lista.get(index).getRedeSocial());
        viewHolder.localizacao.setText(lista.get(index).getLocalizacao());
        viewHolder.data.setText(lista.get(index).getData());
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnProx && index < lista.size() - 1) {
            index++;
            viewHolder.imagem.setImageResource(lista.get(index).getImagem());
            viewHolder.titulo.setText(lista.get(index).getTitulo());
            viewHolder.texto.setText(lista.get(index).getTexto());
            viewHolder.redeSocial.setText(lista.get(index).getRedeSocial());
            viewHolder.localizacao.setText(lista.get(index).getLocalizacao());
            viewHolder.data.setText(lista.get(index).getData());
        }
        if (view.getId() == R.id.btnAnt && index != 0) {
            index--;
            viewHolder.imagem.setImageResource(lista.get(index).getImagem());
            viewHolder.titulo.setText(lista.get(index).getTitulo());
            viewHolder.texto.setText(lista.get(index).getTexto());
            viewHolder.redeSocial.setText(lista.get(index).getRedeSocial());
            viewHolder.localizacao.setText(lista.get(index).getLocalizacao());
            viewHolder.data.setText(lista.get(index).getData());
        }
    }

    public static class ViewHolder {
        Button btnAnt;
        Button btnProx;
        ImageView imagem;
        TextView titulo;
        TextView texto;
        TextView data;
        TextView localizacao;
        TextView redeSocial;
    }

}