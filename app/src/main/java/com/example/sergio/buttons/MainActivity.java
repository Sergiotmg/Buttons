package com.example.sergio.buttons;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAlarm1= findViewById(R.id.btnAlarm1);
        //hacemos el onclick
        //declaramos el contexto se puede hacer el contexto
        //Context context =this;
        btnAlarm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ahora lo mismo que lo haciamos en el xml y declarabamos el metodo
                //Toast.makeText(this, "on Click listener",Toast.LENGTH_LONG);//el this no siempre es el cotexto
                Toast.makeText(getApplicationContext(), "on Click listener",Toast.LENGTH_LONG).show();

                //al estar dentro delmetodo on click el contxrto es view
                //le contexto no es el de la actividad , es l de arriba
            }
        });
        // PARA MANTERN APRETADO
        btnAlarm1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "on Long Click listener", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    public void iconButton(View view) {
        Toast.makeText(getApplicationContext(), "on  Click icon or image button", Toast.LENGTH_SHORT).show();


    }

    public void fabClick(View view) {
    }
}
