package com.lambdaex.demo;

public interface Cab {
	// public void book();
	// public void book(String source, String destination);
	public String book(String source, String destination);
}

class Test {
	public static void main(String[] args) {
		/*
		 * Cab cab=()->System.out.println("Cab has been booked...!"); cab.book();
		 */
		/*
		 * Cab cab = (source, destination) -> System.out
		 * .println("cab is booked from source " + source + " to destination: " +
		 * destination); cab.book("AWB", "HYD");
		 */
		
		  Cab cab=(s,d)->{System.out.println("Cab has been booked from source "+s+
		  " to destination "+d); return "amount: 30000";}; cab.book("nager","pune");
		 
		
	}
}