package com.example.pr5;
import android.os.Bundle; import android.util.SparseBooleanArray; import android.widget.ArrayAdapter; import android.widget.ListView; import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class Task4Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4);
        TextView selection = findViewById(R.id.selection);
        ListView list = findViewById(R.id.list);
        String[] countries = {"Бразилия","Аргентина","Колумбия","Чили","Уругвай"};
        list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, countries));
        list.setOnItemClickListener((parent, view, position, id) -> {
            SparseBooleanArray checked = list.getCheckedItemPositions();
            StringBuilder sb = new StringBuilder("Выбрано: ");
            for (int i = 0; i < countries.length; i++) if (checked.get(i)) sb.append(countries[i]).append(", ");
            selection.setText(sb.toString());
        });
    }
}