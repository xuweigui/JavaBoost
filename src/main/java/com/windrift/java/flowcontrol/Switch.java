package com.windrift.java.flowcontrol;

/**
 * Gary: notice there is no public class in this file, and we can have multiple main methods.
 * After compilation, there are classes such as DefaultCanBeAnyWhere.class, DefaultCanBeAnyWhere$1.class, TypeExtendInSwitch.class
 * etc. So you can run the main method separately.
 */
class DefaultCanBeAnyWhere
{
   public static void main(String[] args)
   {
       String s = "-";
       switch (TimeZone.CST)
       {
           case EST: s += "E";
           case CST: s += "C";
           case MST: s += "M";
           default: s += "X";
           case PST: s += "P";
       }
       System.out.println(s); //-CMXP
   }
}
enum TimeZone
{
    EST, CST, MST, PST;
}


class TypeExtendInSwitch{
    public static void main(String[] args) {
        test1();;
        test2();
        test3();
        test4();
    }

    private static void test1()
    {
        byte b = 1;
        switch (b) {
            case 1: {
                System.out.println("1");
                break;
            }
            case 2: {
                System.out.println("2");
                break;
            }
            default:System.out.println("default");
        }
    }

    private static void test2()
    {
        char b = 1;
        switch (b) {
            case 1: {
                System.out.println("1");
                break;
            }
            case 2: {
                System.out.println("2");
                break;
            }
            default:System.out.println("default");
        }
    }
    private static void test3()
    {
        short b = 1;
        switch (b) {
            case 1: {
                System.out.println("1");
                break;
            }
            case 2: {
                System.out.println("2");
                break;
            }
            default:System.out.println("default");
        }
    }
    private static void test4()
    {
        int b = 1;
        switch (b) {
            case 1: {
                System.out.println("1");
                break;
            }
            case 2: {
                System.out.println("2");
                break;
            }
            default:System.out.println("default");
        }
    }
}
