package fr.diginamic.annotations;

import java.lang.reflect.Field;

public class Validator
{
    public static void abidesRule(Object object) throws RulesRespectException
    {
        Field[] fields = object.getClass().getDeclaredFields();
        String countryName = "";
        
        try
        {
            Field nameField = object.getClass().getDeclaredField("name");
            nameField.setAccessible(true);
            countryName = (String) nameField.get(object);
        } catch (Exception e)
        {
            countryName = "Unknown";
        }

        for (Field f : fields)
        {
            if (f.isAnnotationPresent(Rule.class))
            {
                Rule rule = f.getAnnotation(Rule.class);
                f.setAccessible(true);
                try
                {
                    Object val = f.get(object);
                    if (val instanceof Number)
                    {
                        int fieldVal = ((Number) val).intValue();

                        if (fieldVal < rule.minval())
                        {
                            throw new RulesRespectException(countryName + " did not follow the rule");
                        }
                        System.out.println(countryName + " knew the rule");
                    }
                } catch (IllegalAccessException e)
                {
                    throw new RulesRespectException("useful error message");
                }
            }
        }
    }
}