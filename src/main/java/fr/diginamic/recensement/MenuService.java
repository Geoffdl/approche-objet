package fr.diginamic.recensement;

import java.util.Scanner;

public abstract class MenuService
{
    public MenuService()
    {
    }

    public abstract void traiter(Recensement recensement, Scanner scanner);
}