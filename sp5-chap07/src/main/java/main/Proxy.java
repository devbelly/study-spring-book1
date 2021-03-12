package main;

import chap07.*;

public class Proxy {
	public static void main(String[] args) {
		ExecCalculator cal1 = new ExecCalculator(new ImpeCalculator());
		cal1.factorial(3);
		
		ExecCalculator cal2= new ExecCalculator(new REcCalculator());
		cal2.factorial(3);
	}
}
