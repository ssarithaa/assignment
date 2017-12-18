package com.javaassig;

public class SumofN {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		SumofN s = new SumofN();
		System.out.println(s.findsum(n));
	}

	int findsum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {

			sum = sum + i;
		}

		return sum;
	}
}
