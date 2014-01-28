package com.windrift.scjp;

/**
 * Created by IntelliJ IDEA.
 * User: cy
 * Date: 7/06/12
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Variable
{
    // StringBuffer sb1 = "abcd";  wrong

    Boolean b = new Boolean("abcd");

    //byte c = 255;         should between -128 to 127

    int x = 0x1234;

    //float fl = 1.2;        should be (float) 1.2
    float f1 = 1.2f;
}
