package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar
{
    public static void main(String[] args)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        //init cal
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, 2016);
        cal.set(Calendar.MONTH, 4);
        cal.set(Calendar.DAY_OF_MONTH, 19);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 30);

        Date date = cal.getTime();
        System.out.println(format.format(date));

        //today
        Date today = Calendar.getInstance().getTime();


        SimpleDateFormat anotherFormat = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm", Locale.FRANCE);
        System.out.println(anotherFormat.format(today));

        anotherFormat = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm", Locale.of("ru", "RU"));
//        anotherFormat = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm", new Locale("ru", "RU")); // <- deprecated
        System.out.println(anotherFormat.format(today));

        anotherFormat = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm", Locale.CHINA);
        System.out.println(anotherFormat.format(today));

        anotherFormat = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm", Locale.GERMANY);
        System.out.println(anotherFormat.format(today));


    }
}