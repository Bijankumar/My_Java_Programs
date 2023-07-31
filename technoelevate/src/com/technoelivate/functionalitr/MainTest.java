package com.technoelivate.functionalitr;

public class MainTest {
	public static void main(String[] args) {
		Calculator calculatorObj = new Calculator() {

			public void textMessage() {
				System.out.println("Hi Calculator");
			}

			public void voiceMessage() {
				System.out.println("voice message");
			}
		};
		calculatorObj.textMessage();
//		calculatorObj.voiceMessage();
	}

}
