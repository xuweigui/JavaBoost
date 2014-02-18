package com.windrift.java.general.questions001.question6;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Question 6
 Given:
 • d is a valid, non-null Date object
 • df is a valid, non-null DateFormat object set to the
 current locale
 What outputs the current locales country name and the appropriate
 version of d’s date?
 A. Locale loc = Locale.getLocale();
 System.out.println(loc.getDisplayCountry()
 + “ “+ df.format(d));
 B. Locale loc = Locale.getDefault();
 System.out.println(loc.getDisplayCountry()
 + “ “ + df.format(d));
 C. Locale bc = Locale.getLocale();
 System.out.println(loc.getDisplayCountry()
 + “ “+ df.setDateFormat(d));
 D. Locale loc = Locale.getDefault();
 System.out.println(loc.getDispbayCountry()
 + “ “+ df.setDateFormat(d));
 Answer: B
 */
public class DateTime
{
    public static void main(String[] args)
    {

        b();


    }

/*    public static void a()
    {
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance();
        Locale loc = Locale.getLocale(); //cannot compile, Locale doesn't have method getLocale
        System.out.println(loc.getDisplayCountry()
            + " " + df.format(d));
    }*/

    public static void b()
    {
        Date d = new Date();
        DateFormat df = DateFormat.getDateInstance();
        Locale loc = Locale.getDefault();
        System.out.println(loc.getDisplayCountry() + " " + df.format(d));
    }
}
