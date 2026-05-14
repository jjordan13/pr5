package com.example.pr5;
import android.os.Bundle; import androidx.appcompat.app.AppCompatActivity; import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class Task14Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_task14);
        RecyclerView rv = findViewById(R.id.rv);
        ArrayList<State> list = new ArrayList<>();
        list.add(new State ("Бразилия", "Бразилиа", R.drawable.brazilia));
        list.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.argentina));
        list.add(new State ("Колумбия", "Богота", R.drawable.columbia));
        list.add(new State ("Уругвай", "Монтевидео", R.drawable.uruguai));
        list.add(new State ("Чили", "Сантьяго", R.drawable.chile));
        rv.setAdapter(new StateRVAdapter(list));
    }
}