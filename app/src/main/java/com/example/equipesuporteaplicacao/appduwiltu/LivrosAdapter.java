package com.example.equipesuporteaplicacao.appduwiltu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.equipesuporteaplicacao.appduwiltu.model.Livro;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by equipesuporteaplicacao on 20/10/16.
 */
public class LivrosAdapter extends BaseAdapter {

    List<Livro> livros;
    Context context;

    public LivrosAdapter(List<Livro> livros, Context context) {
        this.livros = livros;
        this.context = context;
    }

    @Override
    public int getCount() {
        return livros.size();
    }

    @Override
    public Object getItem(int position) {
        return livros.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.linha_lista, null);

        Livro livro = livros.get(position);

        String title = livro.getVolumeInfo().getTitle();
        //TextView textViewAutor = (TextView) convertView.findViewById(R.id.textViewAutor);
        /*if (livro.getVolumeInfo().getAuthors() != null) {
            String autor = livro.getVolumeInfo().getAuthors().get(0);
            textViewAutor.setText(autor);
        }else {
            textViewAutor.setVisibility(View.GONE);
        }*/
        String smallThumbnail = livro.getVolumeInfo().getImageLinks().getSmallThumbnail();

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewLivro);
        TextView textViewTitulo = (TextView) convertView.findViewById(R.id.textViewTitulo);

        textViewTitulo.setText(title);
        Picasso.with(context).load(smallThumbnail).into(imageView);

        return convertView;
    }
}
