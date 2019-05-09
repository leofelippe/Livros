package com.example.livros.livros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AdapterView.OnItemClickListener lvOpcoesItemClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvOpcoes = findViewById(R.id.lvOpcoes);
        lvOpcoesItemClick = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                if (position == 0) {
                    exibeMsg("Opção Zero");
                    Intent intent = new Intent(MainActivity.this, LivrosActivity.class);
                    startActivity(intent);
                }
                else if (position == 1)
                    exibeMsg("Opção Autor");
                else if (position == 2)
                    exibeMsg("Opção Editora");
            }
        };
        lvOpcoes.setOnItemClickListener(lvOpcoesItemClick);
    }

    private void exibeMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

}
