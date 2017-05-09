package com.windrift.designpattern.visitor;

/**
 * Created by gary on 21/06/14.
 */
public class Engine implements CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
