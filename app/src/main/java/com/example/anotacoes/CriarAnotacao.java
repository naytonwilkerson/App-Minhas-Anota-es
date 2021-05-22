package com.example.anotacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//import com.example.naytonwilkerson.minhasanotacoes.bancodedados.BancoDeDados;

public class CriarAnotacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_anotacao);
    }


    public void voltar(View v){
        Intent startNewActivity = new Intent(this, MainActivity.class);
        startActivity(startNewActivity);
    }
    public void criarAnotacao(View v){

        EditText titulo = (EditText)findViewById(R.id.campoTitulo);
        EditText conteudo = (EditText)findViewById(R.id.campoConteudo);

        if(titulo.getText().toString().equals("") || titulo.getText().toString().equals(" ")){

            Toast.makeText(getApplicationContext(), "Preencher o Campo Título:",
                    Toast.LENGTH_LONG).show();
        }else {

            /*BancoDeDados bancoDeDados = new BancoDeDados(getBaseContext());
            boolean resultado = bancoDeDados.criarAnotacao(titulo.getText().toString(),
                    conteudo.getText().toString());

            if(resultado) {
                Toast.makeText(getApplicationContext(), "Anotação criada com sucesso!",
                        Toast.LENGTH_LONG).show();
                voltar(v);
            }else{
                Toast.makeText(getApplicationContext(), "Infelizmente ocorreu um erro, tente novamente!",
                        Toast.LENGTH_LONG).show();
            }*/

        }

    }
}
