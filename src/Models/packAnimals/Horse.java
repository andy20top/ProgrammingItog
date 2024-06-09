package Models.packAnimals;

import Models.Animal;
import Models.PackAnimals;

import java.util.Date;

public class Horse extends Animal implements PackAnimals {

    public Horse(String name, String birthDate) {
        super(name, "Horses", birthDate);
    }
}
