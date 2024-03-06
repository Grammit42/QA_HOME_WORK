package org.example;

import java.time.LocalDate;

public interface Animal {

    LocalDate getBirthDate();
    void getBreed();

    String getName();

    void getCost();

    void getCharacter();

    boolean equals();
}
