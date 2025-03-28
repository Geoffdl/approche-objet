package fr.diginamic.sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble
{
    public static void main(String[] args)
    {
        HashSet<Double> a = new HashSet<>(Set.of(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));


        System.out.println(a);

        //find largest
        Double largest = 0.0;
        for (Double val : a)
        {
            if (val > largest)
            {
                largest = val;
            }
        }
        System.out.println("largest val" + largest);

        // Delete smallest
        Double smallest = Collections.min(a);
        System.out.println("Smallest val" + smallest);

        a.remove(smallest);

        System.out.println("Set after removing smallest: " + a);


    }
}