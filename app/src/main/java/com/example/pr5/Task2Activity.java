package com.example.pr5;
import android.os.Bundle; import androidx.appcompat.app.AppCompatActivity;
public class Task2Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2); // Данные подтянутся автоматически через entries
    }
}