package com.windrift.com.windrift.designpattern.visitor;

/**
 * Created by gary on 21/06/14.
 */
public class MaintainVisitor implements CarElementVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("pump the wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("add engine oil");
    }

    @Override
    public void visit(Body body) {
        System.out.println("wash the body");
    }

}
