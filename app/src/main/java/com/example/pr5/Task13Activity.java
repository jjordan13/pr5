package com.example.pr5;
import android.os.Bundle; import android.widget.ArrayAdapter; import android.widget.GridView; import android.widget.Toast; import androidx.appcompat.app.AppCompatActivity;
public class Task13Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_task13);
        GridView gv = findViewById(R.id.grid);
        String[] countries = {"Бразилия","Аргентина","Колумбия","Чили","Уругвай"};
        gv.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries));
        gv.setOnItemClickListener((p, v, pos, id) -> Toast.makeText(this, "Выбрано: " + p.getItemAtPosition(pos), Toast.LENGTH_SHORT).show());
    }
}