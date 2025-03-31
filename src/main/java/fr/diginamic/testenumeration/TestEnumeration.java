package fr.diginamic.testenumeration;

public class TestEnumeration
{
    public static void main(String[] args)
    {

        Season[] seasons = Season.values();

        for (Season season : Season.values())
        {
            System.out.println(season.getLabel());
        }

        String name = "SUMMER";
        System.out.println();
        System.out.println(Season.valueOf(name));

        String label = "Winter";
        System.out.println(Season.WINTER);
        System.out.println();
        System.out.println(Season.getByLabel(label));

    }
}