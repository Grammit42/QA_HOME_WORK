package org.example;

import java.time.LocalDate;
import java.util.Objects;

public abstract class AbstractAnimal implements Animal {

    protected String breed; //Порода
    protected String name;//Имя
    protected Double cost;//Цена  в магазине
    protected String character;//Характер
    protected LocalDate birthDate;//День рождения



    public AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }


/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAnimal animal = (AbstractAnimal) o;
        return Objects.equals(breed, animal.breed) && Objects.equals(name, animal.name) && Objects.equals(cost, animal.cost) && Objects.equals(character, animal.character) && Objects.equals(birthDate, animal.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name, cost, character, birthDate);
    }*/
}

