package com.example.hw_3_4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {
    ArrayList<Animal> arrayList;
    AnimalClick animalClick;

    public AnimalAdapter(ArrayList<Animal> arrayList, AnimalClick animalClick) {
        this.arrayList = arrayList;
        this.animalClick = animalClick;
    }

    @NonNull
    @Override
    public AnimalAdapter.AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_window_one, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalAdapter.AnimalViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
        holder.itemView.setOnClickListener(view -> {
            animalClick.animalClicked(arrayList.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class AnimalViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        TextView color;
        TextView breed;

        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(Animal animal) {
            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.tvName);
            color = itemView.findViewById(R.id.tvColor);
            breed = itemView.findViewById(R.id.tvBreed);
            imageView.setImageResource(animal.getImage());
            name.setText(animal.getName());
            color.setText(animal.getColor());
            breed.setText(animal.getBreed());
        }
    }
}
