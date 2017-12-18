package com.javaassig;

public class AreaCircle {

	public static void main(String[] args) {

		double radius = Integer.parseInt(args[0]);
		System.out.println(findarea(radius));
	}

	static double findarea(double r) {
		double area = 3.14 * (r * r);
		return area;
	}
}
