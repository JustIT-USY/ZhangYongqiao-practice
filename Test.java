package com.lianxi;

public class Test {

	public static void main(String[] args) { //多态的使用 
	Transport aTransport = new Bus();
	Transport bTransport = new Boat();
	Transport cTransport = new Train();
	Transport dTransport = new Plean();
	aTransport.traffic();
	bTransport.traffic();
	cTransport.traffic();
	dTransport.traffic();
	}

}
