package com.example.demo;

public class DemoApplication {

	public static void main(String[] args) throws Exception {
		int a = 0;
		int b = 1;
		System.out.printf("Added: %d%n", Utility.calc(a, b, Operator.ADD));
		System.out.printf("Minus: %d%n", Utility.calc(a, b, Operator.MINUS));
		System.out.printf("Multiplied: %d%n", Utility.calc(a, b, Operator.MULTIPLY));
		System.out.printf("Divided: %d%n", Utility.calc(a, b, Operator.DIVIDE));
	}
}
