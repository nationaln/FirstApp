package tk.nationaln.httpwww.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt;



        bt = (Button) findViewById(R.id.button)
        bt.setOnClickListener(new View.OnClickListener());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent myIntent = new Intent(MainActivity.this,SecondActivity.class;)
        startActivity(myIntent);

    }
}
