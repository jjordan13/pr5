package com.example.pr5;
import android.os.Bundle; import android.widget.ArrayAdapter; import android.widget.AutoCompleteTextView; import androidx.appcompat.app.AppCompatActivity;
public class Task11Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_task11);
        AutoCompleteTextView actv = findViewById(R.id.auto);
        String[] cities = getResources().getStringArray(R.array.cities);
        actv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, cities));
    }
}