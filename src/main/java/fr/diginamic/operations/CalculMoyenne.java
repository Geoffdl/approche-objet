package fr.diginamic.operations;

public class CalculMoyenne
{
    private double[] arrayOfDouble;


    public CalculMoyenne()
    {
        this.arrayOfDouble = new double[0];
    }


    public void setArrayOfDouble(double val)
    {

        double[] newArray = new double[arrayOfDouble.length + 1];

        System.arraycopy(arrayOfDouble, 0, newArray, 0, arrayOfDouble.length);
        newArray[arrayOfDouble.length] = val;
        this.arrayOfDouble = newArray;
    }


    public double calcul()
    {
        double sum = 0.0;

        for (double val : arrayOfDouble)
        {
            sum += val;
        }
        return sum / arrayOfDouble.length;
    }


    public double[] getArrayOfDouble()
    {
        return arrayOfDouble;
    }
}