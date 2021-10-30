package com.imc.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Rectangle implements Shape {
    @Getter
    private final double length;
    @Getter
    private final double width;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}
