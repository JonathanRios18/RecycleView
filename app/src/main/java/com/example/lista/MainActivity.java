package com.example.lista;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NinjaAdapter ninjaAdapter;
    private List<Ninja> ninjaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ninjaList = new ArrayList<>();
        ninjaList.add(new Ninja("Naruto Uzumaki", "Kunai", "Jinchuriki del Kyubi", R.drawable.naruto));
        ninjaList.add(new Ninja("Sasuke Uchiha", "Espada Kusanagi", "Sharingan", R.drawable.sasuke));
        ninjaList.add(new Ninja("Sakura Haruno", "Fuerza sobrehumana", "Experta en ninjutsu médico", R.drawable.sakura));
        ninjaList.add(new Ninja("Kakashi Hatake", "Chidori", "Copianinja", R.drawable.kakashi));

        ninjaAdapter = new NinjaAdapter(ninjaList);
        recyclerView.setAdapter(ninjaAdapter);
    }
}