package fr.diginamic.testenumeration;

public enum Season
{
    SPRING("Spring", 1),
    SUMMER("Summer", 2),
    AUTUMN("Autumn", 3),
    WINTER("Winter", 4);


    private String label;
    private int order;

    Season(String label, int order)
    {
        this.label = label;
        this.order = order;

    }

    public String getLabel()
    {
        return label;
    }

    public int getOrder()
    {
        return order;
    }

    public static Season getByLabel(String label)
    {
        for (Season season : values())
        {
            if (season.getLabel().equals(label))
            {
                return season;
            }
        }
        return null;
    }
}