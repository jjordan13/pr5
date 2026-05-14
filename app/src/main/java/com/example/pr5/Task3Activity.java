package com.example.pr5;
import android.os.Bundle; import android.widget.ArrayAdapter; import android.widget.ListView; import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class Task3Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        TextView selection = findViewById(R.id.selection);
        ListView list = findViewById(R.id.list);
        String[] countries = {"Бразилия","Аргентина","Колумбия","Чили","Уругвай"};
        list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries));
        list.setOnItemClickListener((parent, view, position, id) -> selection.setText(countries[position]));
    }
}