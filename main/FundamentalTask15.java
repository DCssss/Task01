package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask15 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число a = ");
		a = sc.nextInt();
		System.out.println("¬ведите число b = ");
		b = sc.nextInt();
		sc.close();

		while ((a != 0) & (b != 0)) {

			if (a > b) {
				a = a % b;
			} else
				b = b % a;
		}

		System.out.println(a + b);
	}
}