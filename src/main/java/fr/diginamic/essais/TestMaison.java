package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison
{
    public static void main(String[] args)
    {

        Maison maison = new Maison();

        maison.setPiece(new SalleDeBain(10, 1));
        maison.setPiece(new WC(3, 0));
        maison.setPiece(new WC(2.3, 1));
        maison.setPiece(new Chambre(15, 1));
        maison.setPiece(new Chambre(10, 0));
        maison.setPiece(new Salon(25, 0));
        maison.setPiece(new Cuisine(12, 0));
        maison.setPiece(null);
        maison.setPiece(new Salon(-12, -1));

        System.out.println(maison);
        System.out.println("Total area of my house is: " + maison.getTotalArea());
        System.out.println("Total area per floor of my house is: " + maison.getFloorArea(0) + maison.getFloorArea(1));
        System.out.println("Total area per bedroom of my house is: " + maison.getAreaPerTypeOfPiece("Chambre"));
        System.out.println("Total amount of bedrooms in my house is: " + maison.getAmountOfPiecePerTypeOfPiece("Chambre"));
    }
}