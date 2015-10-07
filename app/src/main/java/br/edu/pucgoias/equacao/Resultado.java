package br.edu.pucgoias.equacao;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Resultado extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        double x1 = 0;
        double x2 = 0;
        String resultado;

        Parametros parametro = (Parametros) getIntent().getSerializableExtra("PARAMETRO");

        int a = parametro.getA();
        int b = parametro.getB();
        int c = parametro.getC();

        double delta = Math.pow(b,2)-4*a*c;
        if (delta >= 0) {
            x1 = (-b + Math.sqrt(delta)) / 2*a;
            x2 = (-b - Math.sqrt(delta)) / 2*a;
        }

        resultado = "Valor de A = " + a + "\nValor de B = " + b + "\nValor de C = " + c +
                "\nValor de delta = %.2f" + delta + "\n" + "\nX1 = %.2f" + x1 + "\nX2 = %.2f" + x2;

        TextView resultadoView = new TextView(this);
        resultadoView.setText(resultado);

        setContentView(resultadoView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_resultado, menu);
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
}
