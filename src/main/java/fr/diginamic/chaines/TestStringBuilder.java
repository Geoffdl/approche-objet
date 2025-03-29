package fr.diginamic.chaines;

public class TestStringBuilder
{
    public static void main(String[] args)
    {


        StringBuilder a = new StringBuilder();

        long debut = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
        {
            a.append(i);
        }


        long fin = System.currentTimeMillis();

        System.out.println("Elapsed time in milisec: " + (fin - debut));

        String b = "";

        // See you in a year
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
        {
            b += i;
            System.out.println(b);
        }

        long finish = System.currentTimeMillis();
        System.out.println("Elapsed time in milisec: " + (finish - start));
    }

}