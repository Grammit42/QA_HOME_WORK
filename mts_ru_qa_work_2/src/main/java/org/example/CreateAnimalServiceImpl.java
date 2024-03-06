package org.example;

public class CreateAnimalServiceImpl extends CreateAnimalService {

    public void createNAnimals(double N) {
        for (int i = 0; i < N; i++) {
            AbstractAnimal animal = createAnimal();
            System.out.println("Created animal: " + animal.name);
        }
    }
    public void createNAnimals(int N) {
        for (int i = 0; i < N; i++) {
            AbstractAnimal animal = createAnimal();
            System.out.println("Created animal: " + animal.name);
        }
    }
    @Override
    public void createAnimalWithDoWhile(){
    int count = 0;
    do {
        AbstractAnimal animal = createAnimal();
        System.out.println("Created animal: " + animal.name);
        count++;
    }while (count <= 10);
}
}
