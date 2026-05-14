package com.example.pr5;
import android.os.Bundle; import android.widget.ArrayAdapter; import android.widget.MultiAutoCompleteTextView; import androidx.appcompat.app.AppCompatActivity;
public class Task12Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_task12);
        MultiAutoCompleteTextView actv = findViewById(R.id.auto);
        String[] cities = getResources().getStringArray(R.array.cities);
        actv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, cities));
        actv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}