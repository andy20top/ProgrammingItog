package Models.packAnimals;

import Models.Animal;
import Models.PackAnimals;

import java.util.Date;

public class Camel extends Animal implements PackAnimals {

    public Camel(String name, String birthDate) {
        super(name, "Camels", birthDate);
    }
}
