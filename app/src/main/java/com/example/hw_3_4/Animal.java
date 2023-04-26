package com.example.hw_3_4;

import java.io.Serializable;

public class Animal implements Serializable {
    private int image;
    private String name;
    private String color;
    private String breed;

    public Animal(int image, String name, String color, String breed) {
        this.image = image;
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
