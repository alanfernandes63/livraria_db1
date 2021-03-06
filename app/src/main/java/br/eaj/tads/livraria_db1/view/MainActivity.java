package br.eaj.tads.livraria_db1.view;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.eaj.tads.livraria_db1.R;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
    }


    //Metoto utilizado para ir para tela de cadastro de livros
    public void cadastrarLivro(View v){
        Intent intent = new Intent(this,CadastroLivro.class);
        startActivityForResult(intent,1);
    }

    //Metoto utilizado para ir para tela de que lista os livros
    public void listarLivros(View v){
        Intent intent = new Intent(this,ListarLivros.class);
        startActivityForResult(intent,2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK)
            Snackbar.make(layout,"Salvo com sucesso!",1000);
    }
}
