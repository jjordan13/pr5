package com.example.pr5;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Task5Activity extends AppCompatActivity {
    ArrayList<String> users = new ArrayList<>();
    ArrayList<String> selectedUsers = new ArrayList<>(); // Для отслеживания выделенных
    ArrayAdapter<String> adapter;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5);

        EditText input = findViewById(R.id.input);
        list = findViewById(R.id.list);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, users);
        list.setAdapter(adapter);

        // Начальные данные
        users.add("Tom"); users.add("Bob");
        adapter.notifyDataSetChanged();

        // Слушатель кликов для корректного отслеживания галочек
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                String user = adapter.getItem(position);
                if (list.isItemChecked(position)) {
                    if (!selectedUsers.contains(user)) selectedUsers.add(user);
                } else {
                    selectedUsers.remove(user);
                }
            }
        });

        // Кнопка добавления
        findViewById(R.id.btnAdd).setOnClickListener(v -> {
            String text = input.getText().toString().trim();
            if (!text.isEmpty()) {
                adapter.add(text);
                adapter.notifyDataSetChanged();
                input.setText("");
            }
        });

        // Кнопка удаления
        findViewById(R.id.btnRemove).setOnClickListener(v -> {
            if (selectedUsers.isEmpty()) return; // Защита от краша, если ничего не выбрано

            // Удаляем все выделенные элементы
            for (String user : new ArrayList<>(selectedUsers)) {
                adapter.remove(user);
            }

            selectedUsers.clear();
            list.clearChoices();
            adapter.notifyDataSetChanged();
        });
    }
}