package com.example.anotacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.database.Cursor;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditarAnotacoes extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_anotacoes);

        //@Override
        //BancoDeDados bancoDeDados = new BancoDeDados(getBaseContext());
        //final Cursor cursor = bancoDeDados.consultarAnotacaoPeloId(this.getIntent().getIntExtra("id", 0));

        EditText titulo = (EditText) findViewById(R.id.campoTitulo);
        EditText conteudo = (EditText) findViewById(R.id.conteudoCampo);

        //titulo.setText(cursor.getString(cursor.getColumnIndexOrThrow("titulo")));
        //conteudo.setText(cursor.getString(cursor.getColumnIndexOrThrow("conteudo")));

    }

    public void voltar(View v){
        Intent startNewActivity = new Intent(this, MainActivity.class);
        startActivity(startNewActivity);
    }

    public void atualizarAnotacao(View v){

        EditText titulo = (EditText) findViewById(R.id.campoTitulo);
        EditText conteudo = (EditText) findViewById(R.id.conteudoCampo);
        Intent startNewActivity = new Intent(this, MainActivity.class);

       /* BancoDeDados bancoDeDados = new BancoDeDados(getBaseContext());

        try {
            bancoDeDados.atualizarAnotacao(this.getIntent().getIntExtra("id",0), titulo.getText().toString(),
                    conteudo.getText().toString());
            Toast.makeText(getApplicationContext(),"Anotação atualizada com sucesso",Toast.LENGTH_LONG).show();
            startActivity(startNewActivity);

        }catch (Exception ex){
            Toast.makeText(getApplicationContext(),"Não foi possível atualizada a Anotação, Tente Novamente",Toast.LENGTH_LONG).show();
        }
        */
    }



    public void excluirAnotacao(View v){

            EditText titulo = (EditText) findViewById(R.id.campoTitulo);
            EditText conteudo = (EditText) findViewById(R.id.conteudoCampo);
            Intent startNewActivity = new Intent(this, MainActivity.class);


        /*
        BancoDeDados bancoDeDados = new BancoDeDados(getBaseContext());

        try {
            bancoDeDados.excluirAnotacao(this.getIntent().getIntExtra("id",0));
            Toast.makeText(getApplicationContext(),"Anotação excluida com sucesso",Toast.LENGTH_LONG).show();
            startActivity(startNewActivity);

        }catch (Exception ex){
            Toast.makeText(getApplicationContext(),"Não foi possível Excluir a Anotação, Tente Novamente",Toast.LENGTH_LONG).show();
        }
         */
    }
}
