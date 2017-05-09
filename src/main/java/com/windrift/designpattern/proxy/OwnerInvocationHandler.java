package com.windrift.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler{

	PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (method.getName().startsWith("get")) {
			return method.invoke(person, args);
		} else if (method.getName().equals("setHotOrNotRating")) {
			//can not set hot or not rating for self
			throw new IllegalAccessException();
		} else {
			return method.invoke(person, args);
		}
	}

}
