package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant
{
    public static void main(String[] args)
    {
        Intervenant[] employees = new Intervenant[5];

        employees[0] = new Salarie("Rob", "Cash", 2000);
        employees[1] = new Salarie("Bob", "Vash", 1750.50);
        employees[2] = new Salarie("Dob", "Sash", 2700.42);
        employees[3] = new Pigiste("Job", "Lash", 5, 50);
        employees[4] = new Pigiste("Lob", "Mash", 27, 50);

        for (Intervenant employee : employees)
        {
            System.out.println(employee.afficherDonnees());
        }


    }
}