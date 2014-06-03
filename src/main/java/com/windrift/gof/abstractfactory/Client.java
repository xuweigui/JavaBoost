package com.windrift.gof.abstractfactory;

import javax.annotation.Resource;

public class Client {

    @Resource
	private static AbstractFactory factory;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractProductA productA = factory.produceProductA(); 

	}

}
