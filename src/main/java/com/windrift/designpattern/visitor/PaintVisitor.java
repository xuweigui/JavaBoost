package com.windrift.designpattern.visitor;

/**
 * Created by gary on 21/06/14.
 */
public class PaintVisitor implements CarElementVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("paint wheel to black");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("do nothing to engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("paint body to yellow");
    }
}
