package fr.diginamic.recensement.services;

import fr.diginamic.recensement.model.Recensement;

import java.util.Scanner;

public abstract class MenuService
{
    public MenuService()
    {
    }

    public abstract void traiter(Recensement recensement, Scanner scanner);
}