package com.company;

import java.util.Objects;

public class Animal {
    private String breed;


    public Animal(){

    }
    public Animal(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(breed, animal.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }
}