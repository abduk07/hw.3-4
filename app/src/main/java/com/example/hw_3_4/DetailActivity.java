package com.example.hw_3_4;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    TextView name;
    TextView color;
    TextView breed;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        viewsBind();
        Animal animal = (Animal) getIntent().getSerializableExtra("animal");
        name.setText(animal.getName());
        color.setText(animal.getColor());
        breed.setText(animal.getBreed());
        imageView.setImageResource(animal.getImage());
    }

    private void viewsBind() {
        name = findViewById(R.id.finalName);
        color = findViewById(R.id.finalColor);
        breed = findViewById(R.id.finalBreed);
        imageView = findViewById(R.id.finalImageView);
    }
}