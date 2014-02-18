package com.windrift.java;

/**
 * Created with IntelliJ IDEA.
 * User: cy
 * Date: 23/12/12
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
class ArrayDeclaration
{
    //in array declaration we have to give either size or initialization elements but not both
    public static void main(String[] args)
    {
        int[] a[] = new int[4][4];
        //int b[4] = {1, 2, 3, 4}; //wrong
        int b[] = {1, 2, 3, 4};
        //int c[5]; //wrong
        int c[];
    }
}
