package fr.diginamic.utils;

import fr.diginamic.annotations.ToString;

import java.lang.reflect.Field;

public class StringUtils
{
    public static String BeautifyStringMethodUtilytaryTool(Object obj)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("Beautiful pres` ").append(obj.getClass().getSimpleName()).append(" (");

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field f : fields)
        {
            if (f.isAnnotationPresent(ToString.class))
            {
                f.setAccessible(true);

                try
                {
                    Object val = f.get(obj);
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