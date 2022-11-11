package view;

import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface {
    private Scanner sc;

    public ConsoleUserInterface() {
        sc = new Scanner(System.in);
    }

    @Override
    public <T> void print(T dataToPrint) {
        System.out.println(dataToPrint);
    }

    @Override
    public String read(String textToPrintBeforeInput) {
        System.out.println(textToPrintBeforeInput);
        String line = sc.nextLine();
        if (line == null || line.isEmpty()) {
            return null;
        }
        return line;
    }
}
