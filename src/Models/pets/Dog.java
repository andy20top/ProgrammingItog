package Models.pets;

import Models.Animal;
import Models.Pets;

import java.util.Date;
import java.util.List;

public class Dog extends Animal implements Pets {

    public Dog(String name, String birthDate) {
        super(name, "Dogs", birthDate);
    }
}
