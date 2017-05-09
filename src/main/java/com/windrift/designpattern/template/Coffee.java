package com.windrift.designpattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("Adding Milk and Sugar... ");

	}

	@Override
	protected void brew() {
		System.out.println("Dripping coffee through filter... ");

	}

	@Override
	protected String getName() {
		return "Coffee";
	}

	@Override
	protected boolean isCondimentsNeeded() {
		if ("y".equalsIgnoreCase(getUserInput())) {
			return true;
		}
		return false;
	}

	private String getUserInput() {
		System.out.println("Would you like Milk and Sugar with your Coffee (y/n)?");
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
