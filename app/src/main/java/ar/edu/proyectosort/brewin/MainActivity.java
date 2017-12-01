package ar.edu.proyectosort.brewin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn = (Button)findViewById(R.id.btnFermenter);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

        if(view.getId()== R.id.btnFermenter){
            Intent i = new Intent(MainActivity.this,FermenterActivity.class);
            startActivity(i);
        }

    }

}
