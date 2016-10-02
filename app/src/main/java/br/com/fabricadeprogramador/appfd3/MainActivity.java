package br.com.fabricadeprogramador.appfd3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    @Override
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
        Log.i(TAG,"Chamou o oncreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        Button btnSomar = (Button) findViewById(R.id.btn_somar);
        Button btnSub = (Button)findViewById(R.id.btn_sub);
        Button btnMult = (Button)findViewById(R.id.btn_mult);
        Button btnDiv = (Button) findViewById(R.id.btn_div);





         btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView ed1 =(TextView)findViewById(R.id.ed01);
                TextView ed2 = (TextView)findViewById(R.id.ed02);

                String strN1 = ed1.getText().toString();
                String strN2 = ed2.getText().toString();
                if ((strN1.isEmpty()||strN2.isEmpty())&&(strN2.isEmpty()||strN1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }
                else {
                    Double n1 = Double.parseDouble(ed1.getText().toString());
                    Double n2 = Double.parseDouble(ed2.getText().toString());

                    Double soma = n1 + n2;
                    // Toast.makeText(MainActivity.this,"Soma = "+soma,Toast.LENGTH_SHORT).show();
                    //Criando a navegação entra a main e a resultado
                    Intent irParaResultado = new Intent(MainActivity.this, ResultadoActivity.class);
                    Bundle bundle = new Bundle();
                    //O bundle ira armazenar os parametros e deixalos na intent onde ficara acessival para outras classes
                    bundle.putDouble("calculo", soma);
                    irParaResultado.putExtras(bundle);
                    startActivity(irParaResultado);
                }
                }
            });



        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView ed1 =(TextView)findViewById(R.id.ed01);
                TextView ed2 = (TextView)findViewById(R.id.ed02);

                String strN1 = ed1.getText().toString();
                String strN2 = ed2.getText().toString();
                if ((strN1.isEmpty()||strN2.isEmpty())&&(strN2.isEmpty()||strN1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }
                else {
                    Double n1 = Double.parseDouble(ed1.getText().toString());
                    Double n2 = Double.parseDouble(ed2.getText().toString());
                    Double sub = n1 - n2;
                    // Toast.makeText(MainActivity.this,"Subtração = "+sub,Toast.LENGTH_SHORT).show();
                    Intent irParaResultado = new Intent(MainActivity.this, ResultadoActivity.class);
                    Bundle bundle = new Bundle();
                    //O bundle ira armazenar os parametros e deixalos na intent onde ficara acessival para outras classes
                    bundle.putDouble("calculo", sub);
                    irParaResultado.putExtras(bundle);
                    startActivity(irParaResultado);
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView ed1 =(TextView)findViewById(R.id.ed01);
                TextView ed2 = (TextView)findViewById(R.id.ed02);

                String strN1 = ed1.getText().toString();
                String strN2 = ed2.getText().toString();
                if ((strN1.isEmpty()||strN2.isEmpty())&&(strN2.isEmpty()||strN1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }
                else {
                    Double n1 = Double.parseDouble(ed1.getText().toString());
                    Double n2 = Double.parseDouble(ed2.getText().toString());
                    Double mult = n1 * n2;
                    //Toast.makeText(MainActivity.this,"Multiplicação = "+mult,Toast.LENGTH_SHORT).show();
                    Intent irParaResultado = new Intent(MainActivity.this, ResultadoActivity.class);
                    Bundle bundle = new Bundle();
                    //O bundle ira armazenar os parametros e deixalos na intent onde ficara acessival para outras classes
                    bundle.putDouble("calculo", mult);
                    irParaResultado.putExtras(bundle);
                    startActivity(irParaResultado);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView ed1 =(TextView)findViewById(R.id.ed01);
                TextView ed2 = (TextView)findViewById(R.id.ed02);

                String strN1 = ed1.getText().toString();
                String strN2 = ed2.getText().toString();
                if ((strN1.isEmpty()||strN2.isEmpty())&&(strN2.isEmpty()||strN1.isEmpty())){
                    Toast.makeText(MainActivity.this,"Por favor preencha os campos",Toast.LENGTH_SHORT).show();
                }

                else {
                    Double n1 = Double.parseDouble(ed1.getText().toString());
                    if(n1 == 0){
                        Toast.makeText(MainActivity.this,"O numerador não poder ser 0",Toast.LENGTH_SHORT).show();
                    }
                    Double n2 = Double.parseDouble(ed2.getText().toString());
                    Double div = n1 / n2;
                    //Toast.makeText(MainActivity.this,"Divisão = "+div,Toast.LENGTH_SHORT).show();
                    Intent irParaResultado = new Intent(MainActivity.this, ResultadoActivity.class);
                    Bundle bundle = new Bundle();
                    //O bundle ira armazenar os parametros e deixalos na intent onde ficara acessival para outras classes
                    bundle.putDouble("calculo", div);
                    irParaResultado.putExtras(bundle);
                    startActivity(irParaResultado);
                }
            }
        });


    }
}
