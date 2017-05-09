package com.windrift.designpattern.abstractfactory;

public class Factory1 extends AbstractFactory {

	@Override
	public AbstractProductA produceProductA() {		
		return (AbstractProductA) new ProductA1();
	}

	@Override
	public AbstractProductB produceProductB() {
		return (AbstractProductB) new ProductB1();
	}

}
