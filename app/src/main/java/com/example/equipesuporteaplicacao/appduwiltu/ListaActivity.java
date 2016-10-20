package com.example.equipesuporteaplicacao.appduwiltu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.equipesuporteaplicacao.appduwiltu.model.ImageLinks;
import com.example.equipesuporteaplicacao.appduwiltu.model.Livro;
import com.example.equipesuporteaplicacao.appduwiltu.model.VolumeInfo;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        ListView listView = (ListView) findViewById(R.id.listView);


        ///////////////////////////////////////////////////
        List<Livro> livros = new ArrayList<>();

        Livro livro1 = new Livro();

        VolumeInfo volumeInfo1 = new VolumeInfo();
        volumeInfo1.setTitle("Livro 1");
        ImageLinks imageLinks1 = new ImageLinks();
        imageLinks1.setSmallThumbnail("http://books.google.com/books/content?id=zY6CMlIY0e0C&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api");
        volumeInfo1.setImageLinks(imageLinks1);
        livro1.setVolumeInfo(volumeInfo1);

        Livro livro2 = new Livro();

        VolumeInfo volumeInfo2 = new VolumeInfo();
        volumeInfo2.setTitle("Livro 2");
        ImageLinks imageLinks2 = new ImageLinks();
        imageLinks2.setSmallThumbnail("http://books.google.com/books/content?id=4OtMAgAAQBAJ&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api");
        volumeInfo2.setImageLinks(imageLinks2);
        livro2.setVolumeInfo(volumeInfo2);

        livros.add(livro1);
        livros.add(livro2);
        ////////////////////////////////////////////////////////

        listView.setAdapter(new LivrosAdapter(livros, this));


    }
}
