import Models.Animal;
import Models.Fermers;
import Models.packAnimals.Camel;
import Models.packAnimals.Donkey;
import Models.packAnimals.Horse;
import Models.pets.Cat;
import Models.pets.Dog;
import Models.pets.Hamster;
import View.View;

public class Controller {

    View view;

    public Controller(View view) {
        this.view = view;
    }

    public void run() {
        int choice, id;
        String command;
        Fermers ferma = new Fermers();

        do {
            view.viewMenu();
            choice = view.getValue("Выберете действие: ");


            switch (choice) {

                case 1: {
                    for (int i = 0; i < ferma.getFerma().size(); i++) {
                        System.out.println("id: " + (i + 1) + ", " + ferma.getFerma().get(i));
                    }
                    break;
                }
                case 2: {
                    id = view.getValue("Введите id питомца: ");
                    System.out.println(ferma.getFerma().get(id-1).getCommands());
                    break;
                }
                case 3: {
                    id = view.getValue("Введите id питомца: ");
                    command = view.getCommand("Введите команду, которой хотите научить: ");
                    ferma.getFerma().get(id-1).addCommands(command);
                    break;
                }
                case 4: {
                    String name, date;
                    view.viewTypePet();
                    System.out.println();
                    id = view.getValue("Кого хотите завести? Введите номер: ");
                    if (id == 1) {
                        name = view.getCommand("Введите кличку: ");
                        date = view.getCommand("Введите дату: ");
                        ferma.addAnimal(new Cat(name, date));
                    } else if (id == 2) {
                        name = view.getCommand("Введите кличку: ");
                        date = view.getCommand("Введите дату: ");
                        ferma.addAnimal(new Dog(name, date));
                    } else if (id == 3) {
                        name = view.getCommand("Введите кличку: ");
                        date = view.getCommand("Введите дату: ");
                        ferma.addAnimal(new Hamster(name, date));
                    } else if (id == 4) {
                        name = view.getCommand("Введите кличку: ");
                        date = view.getCommand("Введите дату: ");
                        ferma.addAnimal(new Horse(name, date));
                    } else if (id == 5) {
                        name = view.getCommand("Введите кличку: ");
                        date = view.getCommand("Введите дату: ");
                        ferma.addAnimal(new Camel(name, date));
                    } else if (id == 6) {
                        name = view.getCommand("Введите кличку: ");
                        date = view.getCommand("Введите дату: ");
                        ferma.addAnimal(new Donkey(name, date));
                    } else {
                        System.out.println("NOT!");
                    }
                    break;
                }
                default: {
                    if (choice == 0) System.out.println("Возвращайтесь, когда понадобится!");
                    else System.out.println("Такого действия нет!\n");
                    break;
                }
            }
        } while (choice != 0);
    }
}
