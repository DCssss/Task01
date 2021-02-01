package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask7 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите a = ");
		a = sc.nextInt();
		System.out.println("¬ведите b = ");
		b = sc.nextInt();
		System.out.println("¬ведите c = ");
		c = sc.nextInt();
		sc.close();

		if (a < 0) {
			sum++;
		}

		if (b < 0) {
			sum++;
		}

		if (c < 0) {
			sum++;
		}
		System.out.println(sum);

	}
}