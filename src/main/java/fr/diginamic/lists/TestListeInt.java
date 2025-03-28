package fr.diginamic.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestListeInt
{
    public static void main(String[] args)
    {

        ArrayList<Integer> a = new ArrayList<Integer>(List.of(-1, 5, 7, 3, -2, 4, 8, 5));
       /* ArrayList<Integer> a = new ArrayList<>();
        a.add(-1);
        a.add(5);
        a.add(7);
        a.add(3);
        a.add(-2);
        a.add(4);
        a.add(8);
        a.add(5);

        */

        /*Display all + size*/
        System.out.println("My array list: " + a);
        System.out.println("Is of size : " + a.size());

        //Find largest
        Collections.sort(a);
        System.out.println("My sorted array list : " + a);
        System.out.println("My biggest item : " + a.getLast());

        //remove smallest
        a.removeFirst();
        System.out.println("tiniest removed : " + a);

        //flip to absolute value
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i) < 0)
            {
                a.set(i, a.get(i) * -1);
            }
        }
        System.out.println("negatives are now postives" + a);

    }
}