package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

import java.util.Arrays;


public class ManipulationChaine
{
    public static void main(String[] args)
    {

        String chaine = "Durand;Marcel;2 523.5";


        char firstChar = chaine.charAt(0);

        System.out.println(firstChar);
        System.out.println(chaine.length());
        System.out.println(chaine.indexOf(';'));
        System.out.println(chaine.substring(0, chaine.indexOf(";")));
        System.out.println(chaine.substring(0, chaine.indexOf(";")).toUpperCase());
        System.out.println(chaine.substring(0, chaine.indexOf(";")).toLowerCase());
        System.out.println(Arrays.toString(chaine.split(";")));

        String[] myArray = chaine.split(";");

        double dudeMoney = Double.parseDouble(myArray[2].replace(" ", ""));
        Salarie myAverageShortNameForASalaryManInComputerScience = new Salarie(myArray[0], myArray[1], dudeMoney);

        System.out.println(myAverageShortNameForASalaryManInComputerScience);

    }
}