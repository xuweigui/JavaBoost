package com.windrift.java.general.questions001.question8;


/**
 * Question 8
 Assume that country is set for each class.
 Given:
 10. public class Money {
 11. private String country, name;
 12. public getCountry() { return country; }
 13.}
 and:
 24. class Yen extends Money {
 25. public String getCountry() { return super.country; }
 26. }
 27.
 28. class Euro extends Money {
 29. public String getCountry(String timeZone) {
 30. return super.getCountry();
 31. }
 32. }
 Which two are correct? (Choose two.)
 A. Yen returns correct values.
 B. Euro returns correct values.
 C. An exception is thrown at runtime.
 D. Yen and Euro both return correct values.
 E. Compilation fails because of an error at line 25.
 F. Compilation fails because of an error at line 30.
 Answer: BE
 */
public class Money
{
    private String country, name;

    public String getCountry()  // return type missing
    {
        return country;
    }

    /**
     * Inner class can access private member.
     */
    public class InnerClass
    {
        public String test()
        {
            return country;
        }
    }
}

//class Yen extends Money
//{
//    public String getCountry()
//    {
//        return super.country; //compile error
//    }
//}

class Euro extends Money
{
    public String getCountry(String timeZone)
    {
        return super.getCountry();
    }
}


