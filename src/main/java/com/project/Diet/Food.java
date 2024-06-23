package com.project.Diet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private float energy;
    private float protein;
    private float fat;
    private float carbohydrate;

    public Food() {}

    public Food(String name, float energy, float protein, float fat, float carbohydrate) {
        this.name = name;
        this.energy = energy;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getEnergy() {
        return energy;
    }

    public float getProtein() {
        return protein;
    }

    public float getFat() {
        return fat;
    }

    public float getCarbohydrate() {
        return carbohydrate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public void setCarbohydrate(float carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
