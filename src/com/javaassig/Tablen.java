package com.javaassig;

public class Tablen {

	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		findans(n);

	}

	static void findans(int n) {
		int ans = 1;
		int x = 0;
		do {
			x++;
			ans = x * n;
			System.out.println(x + "*" + n + "=" + ans);
		} while (x != 10);
	}
}
