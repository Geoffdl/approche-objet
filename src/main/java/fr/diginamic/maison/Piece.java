package fr.diginamic.maison;

public abstract class Piece
{
    private int floor;
    private double area;

    public Piece(double area, int floor)
    {
        this.area = area;
        this.floor = floor;
    }

    public int getFloor()
    {
        return floor;
    }

    public void setFloor(int floor)
    {
        this.floor = floor;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    @Override
    public String toString()
    {
        return "Piece" + "floor=" + floor + ", area=" + area + ']';
    }
}