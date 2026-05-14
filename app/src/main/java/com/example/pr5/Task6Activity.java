package com.example.pr5;
import android.os.Bundle; import android.widget.ListView; import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
public class Task6Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView lv = new ListView(this); setContentView(lv);
        ArrayList<State> list = new ArrayList<>();
        list.add(new State ("Бразилия", "Бразилиа", R.drawable.brazilia));
        list.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.argentina));
        list.add(new State ("Колумбия", "Богота", R.drawable.columbia));
        list.add(new State ("Уругвай", "Монтевидео", R.drawable.uruguai));
        list.add(new State ("Чили", "Сантьяго", R.drawable.chile));
        lv.setAdapter(new StateAdapterBasic(this, R.layout.item_state, list));
    }
}