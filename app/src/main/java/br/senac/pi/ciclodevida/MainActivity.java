package br.senac.pi.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "curso";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Executando o método onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Executando o método onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Executando o método onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Executando o método onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Executando o método onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Executando o método onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Executando o método onDestroy()");
    }
}
