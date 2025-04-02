package fr.diginamic.chaines;

public class TestStringBuilder
{
    public static void main(String[] args)
    {


        long debut = System.currentTimeMillis();
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < 100_000; i++)
        {
            a.append(i);
        }


        long fin = System.currentTimeMillis();

        System.out.println("Elapsed time in milisec: " + (fin - debut));

        String b = "";

        // See you in a year
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++)
        {
            b = b + i;


        }
        
        long finish = System.currentTimeMillis();
        System.out.println("Elapsed time in milisec: " + (finish - start));
    }


}