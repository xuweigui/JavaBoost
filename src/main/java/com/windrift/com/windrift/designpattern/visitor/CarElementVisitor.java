package com.windrift.com.windrift.designpattern.visitor;

/**
 * Created by gary on 21/06/14.
 */
public interface CarElementVisitor {
    void visit(Wheel wheel);

    void visit(Engine engine);

    void visit(Body body);
}
