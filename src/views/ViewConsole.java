package views;

import Models.Persona;

public class ViewConsole {
    public void printArrayPersons(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
