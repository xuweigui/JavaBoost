package com.imc.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Circle implements Shape {

    @Getter
    private final double radius;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
