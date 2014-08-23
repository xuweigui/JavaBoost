package com.windrift.com.windrift.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gary on 21/06/14.
 */
public class Car implements CarElement {
    private List<CarElement> elements = new ArrayList<>();

    public void addElement(CarElement element)
    {
        elements.add(element);
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement e : elements) {
            e.accept(visitor);
        }
    }
}
