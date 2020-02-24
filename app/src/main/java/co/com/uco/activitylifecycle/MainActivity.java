package co.com.uco.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtValor;


    public void goToSecondActivity(View view) {
        String valor = txtValor.getText().toString();

        if("".equals(valor)){
            txtValor.setError(getString(R.string.requerido));
        }else {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("VALOR", valor);
            startActivity(intent);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValor = findViewById(R.id.txtValor);

        Toast.makeText(this, "onCreate ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onCreate()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart ".concat(MainActivity.class.getName()) , Toast.LENGTH_LONG).show();
        Log.d("->","onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onResume() ".concat(MainActivity.class.getName()));
    }

    @Override
    public void onPause() {

        super.onPause();
        Toast.makeText(this, "onPause ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onPause() ".concat(MainActivity.class.getName()));
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onStop() ");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
        Log.d("->","onRestart() ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy ".concat(MainActivity.class.getName()), Toast.LENGTH_LONG).show();
        Log.d("->","onDestroy() ");
    }



}
