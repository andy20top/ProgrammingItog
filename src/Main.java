import Models.Animal;
import Models.Fermers;
import Models.pets.Cat;
import Models.pets.Dog;
import Models.pets.Hamster;
import View.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller(new View());
        controller.run();
    }
}