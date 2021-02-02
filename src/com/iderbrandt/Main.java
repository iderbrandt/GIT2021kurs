package com.iderbrandt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> movieList = new ArrayList<>();
        movieList.add("Rick and morty");
        movieList.add("South Park");
        movieList.add("The Mandalorian");
        movieList.add("Breaking bad");
        movieList.add("Alternated Carbon");

        String shortest = movieList.get(0);

                for (String element : movieList) {
            if (element.length() < shortest.length()) {
                shortest = element;
            }
        }


        Collections.sort(movieList);
        System.out.println(shortest);

        System.out.println("List after the use of" +
                " Collection.sort() :\n" + movieList);

    }
}
