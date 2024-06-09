package Models.pets;

import Models.Animal;
import Models.Pets;

import java.util.Date;
import java.util.List;

public class Hamster extends Animal implements Pets {

    public Hamster(String name, String birthDate) {
        super(name, "Hamsters", birthDate);
    }
}
