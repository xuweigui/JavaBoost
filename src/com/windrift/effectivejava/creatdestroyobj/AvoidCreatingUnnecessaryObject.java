package com.windrift.effectivejava.creatdestroyobj;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 15/05/12
 * Time: 10:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class AvoidCreatingUnnecessaryObject {
    
    public static void main (String[] args) {
        /**
         * 1. Reuse immutable objects
         */

        //DON'T DO THIS
        //String s1 = new String("abcde");
        //Use this instead
        String s1 = "abcde";


        //new Boolean("asd");
        Boolean.valueOf("asd");


        /**
         * 2. Reuse of mutable objects.
         * see Person and AnotherPerson
         */


    }
}


/**
 * The version that follows avoids
 * this inefficiency with a static initializer:
 */
class Person {
    private final Date birthDate;
// Other fields, methods, and constructor omitted
    /**
     * The starting and ending dates of the baby boom.
     */
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    static {
        Calendar gmtCal =
                Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }
    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 &&
                birthDate.compareTo(BOOM_END) < 0;
    }
}

/**
 * The isBabyBoomer method unnecessarily creates a new Calendar, TimeZone,
 * and two Date instances each time it is invoked.
 */
class AnotherPerson {
    private final Date birthDate;

    AnotherPerson(Date birthDate) {
        this.birthDate = birthDate;
    }

    // Other fields, methods, and constructor omitted
    // DON'T DO THIS!
    public boolean isBabyBoomer() {
  // Unnecessary allocation of expensive object
        Calendar gmtCal =
                Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0 &&
                birthDate.compareTo(boomEnd) < 0;
    }
}