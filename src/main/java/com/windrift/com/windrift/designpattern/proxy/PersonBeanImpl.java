package com.windrift.com.windrift.designpattern.proxy;

import java.lang.reflect.Proxy;

public class PersonBeanImpl implements PersonBean {
	
	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount = 0;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getGender() {
		return gender;
	}

	@Override
	public String getInterests() {
		return interests;
	}

	@Override
	public int getHotOrNotRating() {
		return ratingCount == 0 ? 0 : rating/ratingCount;
	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;

	}

	@Override
	public void setInterests(String interests) {
		this.interests = interests;

	}

	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		ratingCount++;

	}
	
	static PersonBean getOwnerProxy(PersonBean person) {
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}

}
