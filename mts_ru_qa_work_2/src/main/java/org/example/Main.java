package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {

        CreateAnimalServiceImpl animalService = new CreateAnimalServiceImpl();
        // Вызываем метод для создания 10 животных
        animalService.createTenAnimals();

/*
        CreateService createService = new CreateService();
        List<Animal> animals = createService.create;

        SearchService searchService = new SearchServiceImpl();
        List<String> leapYearNames = searchService.findLeapYearNames(animals);
        List<Animal> olderAnimals = searchService.findOlderAnimal(animals, 5);
        searchService.findDuplicate(animals);

        // Вывод результатов на экран
        System.out.println("Animals born in a leap year: " + leapYearNames);
        System.out.println("Animals older than 5 years: " + olderAnimals);
*/



        //Используем класс Scanner чтобы получить возможность вводить значения N с клавиатуры
        System.out.println("Введите количество животных N =" );
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // Вызываем метод для создания N животных
        animalService.createNAnimals(N);

        animalService.createAnimalWithDoWhile();

    }
}