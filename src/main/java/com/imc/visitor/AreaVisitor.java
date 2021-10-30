package com.imc.visitor;

public class AreaVisitor implements Visitor {

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Area of circle is: " + Math.PI * circle.getRadius() * circle.getRadius());
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Area of rectangule is: " + rectangle.getLength() * rectangle.getWidth());
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out.println("Area of triangle is: " + triangle.getBase() * triangle.getHeight() / 2);
    }
}
