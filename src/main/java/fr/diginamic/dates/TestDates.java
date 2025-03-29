package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates
{
    public static void main(String[] args)
    {

        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format.format(today));

        Date date = new Date(116, 4, 19, 23, 59, 30);
        SimpleDateFormat completeformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(completeformat.format(date));

        Date sysTime = new Date();
        System.out.println(completeformat.format(sysTime));
    }
}