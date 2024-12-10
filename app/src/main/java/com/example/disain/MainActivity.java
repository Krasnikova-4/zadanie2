package com.example.disain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button helloText;
    private ImageButton startButton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        helloText = (Button) findViewById(R.id.helloText);
        startButton = (ImageButton) findViewById(R.id.startButton);

    }


    public void onStartButtonClick(View view) {
        startButton.setImageResource(R.drawable.ic_launcher_foreground);
        helloText.setVisibility(View.VISIBLE);
        startButton.setClickable(false);
    }

    public void onHelloButton(View view) {
        Button button = findViewById(R.id.helloText);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);

        

    }

}