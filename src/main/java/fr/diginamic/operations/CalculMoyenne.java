package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne
{
    private double[] arrayOfDouble;


    public CalculMoyenne()
    {
        this.arrayOfDouble = new double[0];
    }

    public void setArrayOfDouble(double val)
    {
        this.arrayOfDouble = Arrays.copyOf(arrayOfDouble, arrayOfDouble.length + 1);
        this.arrayOfDouble[arrayOfDouble.length - 1] = val;
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