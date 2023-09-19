package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
        protected void onCreate(Bundle savedInstances){
        super.onCreate(savedInstances);
        setContentView(R.layout.activity_main);
        // Luodaan referenssi käyttöliittymäelementtiin TextView
        //TextView helloText = findViewById(R.id.textView);
        //helloText.setText("Hello from code");
    }


    public void buttonClicked(View view) {

        TextView helloText = findViewById(R.id.textView);
        helloText.setText(R.string.updated_text);

    }
}
