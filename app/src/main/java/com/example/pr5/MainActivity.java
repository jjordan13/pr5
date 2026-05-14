package com.example.pr5;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Class[] activities = {Task1Activity.class, Task2Activity.class, Task3Activity.class,
                Task4Activity.class, Task5Activity.class, Task6Activity.class, Task7Activity.class,
                Task8Activity.class, Task9Activity.class, Task10Activity.class, Task11Activity.class,
                Task12Activity.class, Task13Activity.class, Task14Activity.class, Task15Activity.class};

        for (int i = 1; i <= 15; i++) {
            int finalI = i;
            findViewById(getResources().getIdentifier("btn" + finalI, "id", getPackageName()))
                    .setOnClickListener(v -> startActivity(new Intent(MainActivity.this, activities[finalI - 1])));
        }
    }
}