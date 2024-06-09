package View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String msg) {
        System.out.println(msg);
        return in.nextInt();
    }

    public String getCommand(String msg) {
        System.out.println(msg);
        return in.next();
    }

    public void viewMenu() {
        System.out.println("1. Посмотреть список животных");
        System.out.println("2. Посмотреть команды, которые знает питомец");
        System.out.println("3. Научить команде питомца");
        System.out.println("4. Завести нового питомца");
        System.out.println("0. чтобы завершить");
    }

    public void viewTypePet() {
        System.out.println("1. Кошку");
        System.out.println("2. Собаку");
        System.out.println("3. Хомяка");
        System.out.println("4. Лошадь");
        System.out.println("5. Верблюда");
        System.out.println("6. Осла");
    }

}
