package fr.diginamic.maison;

import java.util.Arrays;

public class Maison
{
    private Piece[] house = new Piece[0];

    public void setPiece(Piece piece)
    {
        if (piece == null || piece.getFloor() < 0 || piece.getArea() < 0)
        {
            return;
        }

        Piece[] newArray = new Piece[house.length + 1];
        System.arraycopy(house, 0, newArray, 0, house.length);
        newArray[house.length] = piece;
        this.house = newArray;

    }

    public double getTotalArea()
    {
        double totalArea = 0;
        for (Piece piece : house)
        {
            if (piece != null)
            {
                totalArea += piece.getArea();
            }
        }
        return totalArea;
    }

    public double getFloorArea(int floor)
    {
        double area = 0;
        for (Piece piece : house)
        {
            if (piece != null && piece.getFloor() == floor)
            {
                area += piece.getArea();
            }
        }
        return area;
    }

    public double getAreaPerTypeOfPiece(String typePiece)
    {
        double area = 0;
        for (Piece piece : house)
        {
            if (piece != null && piece.getClass().getSimpleName().equals(typePiece))
            {
                area += piece.getArea();
            }
        }
        return area;
    }

    public int getAmountOfPiecePerTypeOfPiece(String typePiece)
    {
        int count = 0;
        for (Piece piece : house)
        {
            if (piece != null && piece.getClass().getSimpleName().equals(typePiece))
            {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString()
    {
        return "Maison{" +
                "house=" + Arrays.toString(house) +
                '}';
    }
}