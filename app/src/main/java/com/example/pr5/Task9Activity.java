package com.example.pr5;
import android.os.Bundle; import android.widget.ArrayAdapter; import android.widget.Spinner; import androidx.appcompat.app.AppCompatActivity;
public class Task9Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_task9);
        Spinner sp = findViewById(R.id.spinner);
        String[] countries = getResources().getStringArray(R.array.countries);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, countries);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ad);
    }
}