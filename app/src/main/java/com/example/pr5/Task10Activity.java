package com.example.pr5;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter; import android.widget.Spinner; import android.widget.TextView; import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
public class Task10Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_task10);
        TextView sel = findViewById(R.id.selection); Spinner sp = findViewById(R.id.spinner);
        String[] countries = getResources().getStringArray(R.array.countries);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, countries);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> p, View v, int pos, long id) { sel.setText((String)p.getItemAtPosition(pos)); }
            public void onNothingSelected(AdapterView<?> p) {}
        });
    }
}