package com.company;

import java.util.Objects;

public class Horse extends Animal{
        private String name;
        private Integer power;

        public Horse(){

        }


        public Horse(String breed, String name, Integer power) {
            super(breed);
            this.name = name;
            this.power = power;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPower() {
            return power;
        }

        public void setPower(Integer power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "Horse: " +
                    " breed: " + getBreed() +
                    " name: " + name + '\'' +
                    " power: " + power ;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(name, horse.name) && Objects.equals(power, horse.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }
}

