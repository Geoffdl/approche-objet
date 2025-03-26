package fr.diginamic.tri;

import fr.diginamic.lists.Ville;

import java.util.ArrayList;
import java.util.Collections;

public class TestTri {
    public static void main(String[] args) {

        ArrayList<Ville> cities = new ArrayList<>();

        cities.add(new Ville("Nice", 343_000));
        cities.add(new Ville("Carcassonne", 47_800));
        cities.add(new Ville("Narbonne", 53_400));
        cities.add(new Ville("Lyon", 484_000));
        cities.add(new Ville("Foix", 9_700));
        cities.add(new Ville("Pau", 77_200));
        cities.add(new Ville("Marseille", 850_700));
        cities.add(new Ville("Tarbes", 40_600));

        System.out.println(cities);

        Collections.sort(cities);
        System.out.println(cities);


    }
}