package Models.pets;

import Models.Animal;
import Models.Pets;

import java.util.Date;
import java.util.List;

public class Cat extends Animal implements Pets {

    public Cat(String name, String birthDate) {
        super(name, "Cats", birthDate);
    }
}
