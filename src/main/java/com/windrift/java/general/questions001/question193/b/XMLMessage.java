package com.windrift.java.general.questions001.question193.b;

import com.windrift.java.general.questions001.question193.a.Message;

/**
 * @author Gary Xu
 */
public class XMLMessage extends Message
{
    //can use super.getText() since it is not visible here
    String getText() { return "<msg>text</msg>"; }
    public static void main(String[] args)
    {
        System.out.println(new XMLMessage().getText());
    }
}
