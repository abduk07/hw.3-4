package com.example.hw_3_4;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AnimalClick {
    ArrayList<Animal> animalArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        initAdapter();
    }

    private void initAdapter() {
        AnimalAdapter animalAdapter = new AnimalAdapter(animalArrayList, this);
        RecyclerView recyclerView;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(animalAdapter);
    }

    private void initList() {
        animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal(R.drawable.img_1, "Боб", "Бежевый", "ШПИЦ"));
        animalArrayList.add(new Animal(R.drawable.img_2, "Рэкс", "Черный", "ОВЧАРКА"));
        animalArrayList.add(new Animal(R.drawable.img_3, "Белка", "Белый", "ДВОРНЯГА"));
        animalArrayList.add(new Animal(R.drawable.img_4, "Чук", "Серый", "ХАСКИ"));
    }

    @Override
    public void animalClicked(Animal animal) {
        System.out.println("name " + animal.getName());
        System.out.println("breed " + animal.getBreed());
        System.out.println("color " + animal.getColor());
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("animal", animal);
        startActivity(intent);
    }
}