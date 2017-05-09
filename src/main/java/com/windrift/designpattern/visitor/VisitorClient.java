package com.windrift.designpattern.visitor;

/**
 * Created by gary on 21/06/14.
 */
public class VisitorClient {
    public static void main(String[] args) {
        Car car = new Car();
        car.addElement(new Engine());
        car.addElement(new Body());
        car.addElement(new Wheel());
        car.addElement(new Wheel());
        car.addElement(new Wheel());
        car.addElement(new Wheel());
        car.accept(new PaintVisitor());
        car.accept(new MaintainVisitor());
    }
}
