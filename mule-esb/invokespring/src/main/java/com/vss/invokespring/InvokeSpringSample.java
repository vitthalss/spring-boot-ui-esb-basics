package com.vss.invokespring;

public class InvokeSpringSample {

	public String methodA() {
		System.out.println("Method A of spring bean sample activated");
		return "Method A";
	}

	public String methodB() {
		System.out.println("Method B of spring bean sample activated");
		return "Method B";
	}

	public String methodC(String inputA, String inputB) {
		System.out.println("Method C of spring bean sample activated");
		return "Method C got "+inputA+" and "+inputB;
	}

}
