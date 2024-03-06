package org.example;
import java.util.List;

public interface SearchService {

    List<String> findLeapYearNames(List<Animal> animals);
    List<Animal> findOlderAnimal(List<Animal> animals, int age);

    void findDiplicate(List<Animal> animals);

}
