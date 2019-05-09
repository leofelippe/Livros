package com.example.livros.livros;

import android.support.v7.app.AppCompatActivity;

public class LivrosActivity extends AppCompatActivity {

    AdapterView.OnItemClickListener itemClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livros);

        ListView lvLivros = findViewById(R.id.lvLivros);


        ArrayAdapter<Livro> livroArrayAdapter = new ArrayAdapter<Livro>(
                this,
                android.R.layout.simple_list_item_1,
                Livro.livros);
        lvLivros.setAdapter(livroArrayAdapter);


        itemClick = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                Intent intent = new Intent(LivrosActivity.this, ObraActivity.class);
                intent.putExtra(ObraActivity.EXTRA_NUMLIVRO, (int) id);
                startActivity(intent);
            }
        };
        lvLivros.setOnItemClickListener(itemClick);
    }
}
