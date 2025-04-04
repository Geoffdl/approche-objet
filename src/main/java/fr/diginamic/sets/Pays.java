package fr.diginamic.sets;

import fr.diginamic.annotations.Rule;
import fr.diginamic.annotations.ToString;

import java.lang.reflect.Field;

public class Pays
{
    @ToString(uppercase = true, separator = "-> ")
    private String name;
    @ToString(uppercase = true, separator = "m.hab")
    @Rule(minval = 1000)
    private int population;

    private double gdp;

    public Pays(String name, int population, double gdp)
    {

        this.name = name;
        this.population = population;
        this.gdp = gdp;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPopulation()
    {
        return population;
    }

    public void setPopulation(int population)
    {
        this.population = population;
    }

    public double getGdp()
    {
        return gdp;
    }

    public void setGdp(double gdp)
    {
        this.gdp = gdp;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Beautiful pres` ").append(getClass().getSimpleName()).append(" (");

        Field[] fields = getClass().getDeclaredFields();

        for (Field f : fields)
        {
            if (f.isAnnotationPresent(ToString.class))
            {
                f.setAccessible(true);

                try
                {
                    Object val = f.get(this);
                    ToString annotation = f.getAnnotation(ToString.class);
                    if (val instanceof String && annotation.uppercase())
                    {
                        val = ((String) val).toUpperCase();

                    }
                    if (val instanceof String)
                    {
                        sb.append("'").append(val).append("'");
                    } else
                    {
                        sb.append(val);
                    }

                    if (!annotation.separator().isEmpty())
                    {
                        sb.append(" ").append(annotation.separator());
                    }

                } catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
        sb.append(") ");
        return sb.toString();
    }
}