package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CreateService implements SearchService {
    @Override
    public List<String> findLeapYearNames(List<Animal> animals) {

        /*Метод при помощи цикла перебирает массив и находит животных, которые родились в високосный год*/
        List<String> leapYearNames = new ArrayList<>();

        for (Animal animal : animals) {
            LocalDate birthDate = animal.getBirthDate();
            if (isLeapYear(birthDate.getYear())) {
                leapYearNames.add(animal.getName());
            }
        }

        return leapYearNames;
    }

    private boolean isLeapYear(int year) {//Проверка года на весокостность
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }




/*    @Test
    @DisplayName("Test findLeapYearNames method")
    void testFindLeapYearNames() {
        SearchService searchService = new SearchServiceImpl();
        List<Animal> animals = new ArrayList<>();
        animals.add(new AbstractAnimal("Breed1", "Name1", 100.0, "Character1", LocalDate.of(2020, 1, 1)));
        animals.add(new AbstractAnimal("Breed2", "Name2", 200.0, "Character2", LocalDate.of(2021, 2, 2)));

        List<String> leapYearNames = searchService.findLeapYearNames(animals);
        assertEquals(1, leapYearNames.size());
        assertEquals("Name1", leapYearNames.get(0));
    }*/

    @Override
    public List<Animal> findOlderAnimal(List<Animal> animals, int N) {

        List<Animal> olderAnimals = new ArrayList<>();

        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();

        for (Animal animal : animals) {
            LocalDate birthDate = animal.getBirthDate();
            int age = currentYear - birthDate.getYear();
            if (age > N) {
                olderAnimals.add(animal);
            }
        }

        return olderAnimals;
    }


/*    @Test
    @DisplayName("Test findOlderAnimal method")
    void testFindOlderAnimal() {
        SearchService searchService = new SearchServiceImpl();
        List<Animal> animals = new ArrayList<>();
        animals.add(new AbstractAnimal("Breed1", "Name1", 100.0, "Character1", LocalDate.of(2010, 1, 1)));
        animals.add(new AbstractAnimal("Breed2", "Name2", 200.0, "Character2", LocalDate.of(2015, 2, 2)));

        List<Animal> olderAnimals = searchService.findOlderAnimal(animals, 10);
        assertEquals(1, olderAnimals.size());
        assertEquals("Name1", olderAnimals.get(0).getName());
    }*/


    @Override
    public void findDiplicate(List<Animal> animals) {

        List<Animal> uniqueAnimals = new ArrayList<>();
        List<Animal> duplicateAnimals = new ArrayList<>();

        for (Animal animal : animals) {
            if (!isAnimalUnique(animal, uniqueAnimals)) {
                duplicateAnimals.add(animal);
            } else {
                uniqueAnimals.add(animal);
            }
        }

        if (!duplicateAnimals.isEmpty()) {//Проверка массива на наличие элементов
            System.out.println("Животные, которые дублируются:");
            for (Animal animal : duplicateAnimals) {
                System.out.println(animal);
            }
        } else {
            System.out.println("Повторяющихся животных нет.");
        }
    }

    private boolean isAnimalUnique(Animal animal, List<Animal> animals) {
        /*Приватный метод используемый только в данном класе, созданный для сравнения методом equals*/
        for (Animal a : animals) {
            if (a.equals(animal)) {
                return false;
            }
        }
        return true;
    }




/*    @Test
    @DisplayName("Test findDuplicate method")
    void testFindDuplicate() {
        SearchService searchService = new SearchServiceImpl();
        List<Animal> animals = new ArrayList<>();
        animals.add(new AbstractAnimal("Breed1", "Name1", 100.0, "Character1", LocalDate.of(2010, 1, 1)));
        animals.add(new AbstractAnimal("Breed1", "Name1", 100.0, "Character1", LocalDate.of(2010, 1, 1)));

        // Вывод дубликатов на экран
        searchService.findDuplicate(animals);
    }*/

//Реализую методы интерфейса SearchService


}