package Models;

import java.util.ArrayList;
import java.util.List;

public class Fermers {
    public List<Animal> ferma = new ArrayList<>();

    public List<Animal> getFerma() {
        return ferma;
    }

    public void addAnimal(Animal animal) {
        ferma.add(animal);
    }


}
