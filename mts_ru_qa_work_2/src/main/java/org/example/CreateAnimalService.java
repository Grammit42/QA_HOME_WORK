package org.example;

public class CreateAnimalService {
    public void createTenAnimals() {
        int count = 0;
        while (count < 10) {
            AbstractAnimal animal = createAnimal();
            System.out.println("Created animal: " + animal.name);
            count++;
        }
    }
    public void createAnimalWithDoWhile(){}
    protected AbstractAnimal createAnimal() {
        // Реализовать в подклассах при необходимости
        return null;
    }
}
