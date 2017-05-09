package com.windrift.designpattern.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new ChicagoStyleCheesePizza();
		} else {
			return null;
		}
	}

}
