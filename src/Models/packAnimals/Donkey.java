package Models.packAnimals;

import Models.Animal;
import Models.PackAnimals;

import java.util.Date;

public class Donkey extends Animal implements PackAnimals {

    public Donkey(String name, String birthDate) {
        super(name, "Donkeys", birthDate);
    }
}
