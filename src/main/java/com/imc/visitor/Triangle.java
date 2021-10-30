package com.imc.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Triangle implements Shape {
    @Getter
    private final double base;
    @Getter
    private final double height;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTriangle(this);
    }
}
