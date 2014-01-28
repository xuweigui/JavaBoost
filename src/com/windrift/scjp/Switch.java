package com.windrift.scjp;

/**
 * Created with IntelliJ IDEA.
 * User: cy
 * Date: 23/12/12
 * Time: 9:37 PM
 * To change this template use File | Settings | File Templates.
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
