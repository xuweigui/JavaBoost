package com.imc.visitor;

import java.util.Arrays;
import java.util.List;

public class ShapeVisitorDemo {

    public static final void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(2.0), new Triangle(3, 4), new Rectangle(5, 6));
        Visitor areaVisitor = new AreaVisitor();

        shapes.forEach(shape -> shape.accept(areaVisitor));
    }
}
