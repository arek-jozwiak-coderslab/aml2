package pl.coderslab.day1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

    private static final String EXIT_STRING = "EXIT";

    public static void main(String[] args) {

        System.out.println("Type sth:");
        Scanner scanner = new Scanner(System.in);
        Set<String> elements = new HashSet<>();
        int counter = 0;
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();

            if (s.equals(EXIT_STRING)) {
                break;
            }
            counter++;
            elements.add(s);

        }
        System.out.println("Pobranych napisów " + counter);
        System.out.println("Rozmiar kolekcji " + elements.size());
    }
}
