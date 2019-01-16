package com.sl2.app3widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final Button button4 = (Button) findViewById(R.id.button4);
    final Button button3 = (Button) findViewById(R.id.button3);
    final TextView label = (TextView) findViewById(R.id.textView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void boton4(View v){
        Toast.makeText(MainActivity.this,"Versión 1.0.", Toast.LENGTH_SHORT).show();

    }

    public void changeText(String text){
       // TextView t = (TextView) this.getView().findViewById(R.id.tView); t.setText(text);
    }
}
