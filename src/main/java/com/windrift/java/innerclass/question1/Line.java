package com.windrift.java.innerclass.question1;


public class Line
{
    public static class Point
    {

    }
}

class Triangle
{
    Line.Point point = new Line.Point();

    Line l = new Line();
//    l.Point p = new l.Point(); //error
}
