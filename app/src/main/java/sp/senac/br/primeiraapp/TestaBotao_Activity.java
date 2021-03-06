package sp.senac.br.primeiraapp;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class TestaBotao_Activity extends AppCompatActivity {

    FloatingActionButton botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testa_botao_layout);

        Toolbar mBarra = (Toolbar)findViewById(R.id.tlbPrincipal);
        setSupportActionBar(mBarra);

        botao = (FloatingActionButton) findViewById(R.id.botaoteste);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cliquei no Botão", Toast.LENGTH_SHORT).show();
            }
        });

        onCreateOptionsMenu(Menu menu){
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.menu_principal, menu);
            return super.onCreateOptionsMenu(menu);
        }

        onOptionsItemSelected(AdapterView.OnItemSelect)
    }
}
