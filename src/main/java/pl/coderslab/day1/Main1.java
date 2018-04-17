package pl.coderslab.day1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {


    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();

        for (int i = 10; i < 20; i++) {
            elements.add(i);
        }

        for (Integer a: elements ) {
            System.out.println(a);
        }


    }
}
