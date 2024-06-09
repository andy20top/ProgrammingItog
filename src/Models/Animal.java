package Models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Animal {

    protected String name;
    protected String type;
    protected String birthDate;
    protected List<String> commands;


    public Animal(String name, String type, String birthDate) {
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }



    public String getInfo() {
        return String.format("Name: %s, Type: %s, Commands: %s, Date: %s",
                this.getName(), this.type, this.getCommands(), this.getBirthDate());
    }


    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void addCommands(String command) {
        this.commands.add(command);
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
