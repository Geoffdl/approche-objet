package fr.diginamic.annotations;

import fr.diginamic.sets.Pays;
import fr.diginamic.utils.StringUtils;

public class TestToString
{
    public static void main(String[] args)
    {
        Pays p = new Pays("France", 5, 10);
        Pays p2 = new Pays("Belgium", 2_000_000, 10);


        System.out.println(p);
        System.out.println(p2);
        System.out.println("_____________________________");
        System.out.println(StringUtils.BeautifyStringMethodUtilytaryTool(p));

        System.out.println("\n\n\n\n");
        Validator.abidesRule(p2);
        Validator.abidesRule(p);

    }


}