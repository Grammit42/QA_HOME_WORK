package org.example;

import java.time.LocalDate;

public class Pet extends AbstractAnimal{
    public Pet(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public void getBreed() {

    }

    @Override
    public String getName() {

        return null;
    }

    @Override
    public void getCost() {

    }

    @Override
    public void getCharacter() {

    }
    @Override
    public boolean equals() {
        return equals();
    }
}
