package br.edu.pucgoias.equacao;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class EquacaoMainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equacao_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_equacao_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void enviar(View view) {

        int valorA = Integer.parseInt(((EditText) findViewById(R.id.edtValorA)).getText().toString());
        int valorB = Integer.parseInt(((EditText) findViewById(R.id.edtValorB)).getText().toString());
        int valorC = Integer.parseInt(((EditText) findViewById(R.id.edtValorC)).getText().toString());

        Parametros parametros = new Parametros(valorA,valorB,valorC);

        Intent intent = new Intent(this, Resultado.class);
        intent.putExtra("PARAMETRO",parametros);
        startActivity(intent);

    }
}
