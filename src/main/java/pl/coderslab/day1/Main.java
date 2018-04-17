package pl.coderslab.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<String> someList = new ArrayList<>();

        someList.add("some 1");
        someList.add("somm 2");

        ListIterator<String> slit = someList.listIterator();

    }
}
