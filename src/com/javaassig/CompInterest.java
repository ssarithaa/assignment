package com.javaassig;

public class CompInterest {
	public static void main(String[] args) {
		double principle = Double.parseDouble(args[0]);
		double roi = Double.parseDouble(args[1]);
		double yrs = Double.parseDouble(args[2]);

		CompInterest c1 = new CompInterest();
		System.out.println("CI : " + principle * (c1.findvalue(roi, yrs)));
	}

	double findvalue(double roi, double yrs) {
		double val = 1;
		for (int i = 1; i <= yrs; i++) {
			val = val * (1 + (roi / 100));

		}
		return val;
	}

}
