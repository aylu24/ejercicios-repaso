package com.company;

import java.util.Objects;

public class Dog extends Animal {
    private Integer legs;
    private Integer age;

    public Dog(){

    }


    public Dog(String breed, Integer legs, Integer age) {
        super(breed);
        this.legs = legs;
        this.age = age;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog: " +
                " breed: " + getBreed() +
                " legs: " + legs +
                ", age: " + age ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(legs, dog.legs) && Objects.equals(age, dog.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legs, age);
    }
}


