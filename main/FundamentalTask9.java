package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask9 {
	public static void main(String[] args) {
		double x = 0;
		double f = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" x = ");
		x = sc.nextDouble();
		sc.close();

		if (x <= 3) {
			f = x * x - 3 * x + 9;

		}
		if (x > 3) {
			f = 1 / (x * x * x + 6);
		}

		System.out.println(" F(x) = " + f);
	}
}