package com.windrift.designpattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("Adding Lemon... ");

	}

	@Override
	protected void brew() {
		System.out.println("Steeping the tea... ");

	}

	@Override
	protected String getName() {
		return "Tea";
	}

	@Override
	protected boolean isCondimentsNeeded() {
		if ("y".equalsIgnoreCase(getUserInput())) {
			return true;
		}
		return false;
	}

	private String getUserInput() {
		System.out.println("Would you like lemon with your tea (y/n)?");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String answer = "N";
		try {
			answer = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return answer;
	}

}
