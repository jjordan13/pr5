package com.example.pr5;
import android.os.Bundle; import android.widget.ListView; import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList; import java.util.Arrays;
public class Task8Activity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView lv = new ListView(this); setContentView(lv);
        ArrayList<Product> products = new ArrayList<>(Arrays.asList(
                new Product("Картофель","кг"), new Product("Чай","шт"), new Product("Молоко","л")));
        lv.setAdapter(new ProductAdapter(this, R.layout.item_product, products));
    }
}