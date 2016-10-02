package br.com.fabricadeprogramador.appfd3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Everton on 01/10/2016.
 */
public class ResultadoActivity extends Activity {

    private final String TAG = "FDP ResultadoActivity";
    protected void onStart() {
        Log.i(TAG,"Chamou o onstart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG,"Chamou o onresume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG,"Chamou o onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG,"Chamou o onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"Chamou o onDestroy");
        super.onDestroy();
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"Chamou o onCreate "+TAG);
        //carregano a view resultado
        setContentView(R.layout.resultado);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Double calculo = bundle.getDouble("calculo");
        //Mudando a maneira de renderizar o resultado na tela
        //Toast.makeText(this,calculo.toString(),Toast.LENGTH_SHORT).show();
        TextView tvResultado = (TextView)findViewById(R.id.resp_resultado);
        tvResultado.setText(calculo.toString());

        Button btnFechar = (Button)findViewById(R.id.fechar);
        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
