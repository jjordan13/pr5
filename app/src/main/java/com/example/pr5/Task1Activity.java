package com.example.pr5;
import android.os.Bundle; import android.widget.ArrayAdapter; import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
public class Task1Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        ListView list = findViewById(R.id.list);
        String[] countries = {"Бразилия","Аргентина","Колумбия","Чили","Уругвай"};
        list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries));
    }
}