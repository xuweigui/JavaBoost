package com.windrift.designpattern.visitor;

/**
 * Created by gary on 21/06/14.
 */
public interface CarElement {
    public void accept(CarElementVisitor visitor);
}
