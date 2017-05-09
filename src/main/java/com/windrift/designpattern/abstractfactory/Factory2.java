package com.windrift.designpattern.abstractfactory;

public class Factory2 extends AbstractFactory {

	@Override
	public AbstractProductA produceProductA() {		
		return (AbstractProductA) new ProductA2();
	}

	@Override
	public AbstractProductB produceProductB() {
		return (AbstractProductB) new ProductB2();
	}

}
