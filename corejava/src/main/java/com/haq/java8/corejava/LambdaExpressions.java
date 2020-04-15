package com.haq.java8.corejava;

// Added comment in forked centipedeftc
public class LambdaExpressions {
	public static void main(String[] args) {
		new LambdaExpressions().printExpression();
	}

	public void printExpression() {
		Printer printer = (stringToPrint) -> {System.out.println(stringToPrint);};
		printer.print("Hello World!!");
	}

	interface Printer {
		void print(String str);
	}
}
