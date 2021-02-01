package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask8 {

	public static void main(String[] args) {
		int a;
		int b;
		int x;
		int y;
		int z;

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите A = ");
		a = sc.nextInt();
		System.out.println("¬ведите B = ");
		b = sc.nextInt();
		System.out.println("¬ведите x = ");
		x = sc.nextInt();
		System.out.println("¬ведите y = ");
		y = sc.nextInt();
		System.out.println("¬ведите z = ");
		z = sc.nextInt();
		sc.close();

		if (((a >= x) & (b >= y)) || ((a >= y) & (b >= x)) || ((a >= x) & (b >= z)) || ((a >= z) & (b >= x))
				|| (((a >= z) & (b >= y)) || ((a >= y) & (b >= z)))) {
			System.out.println("влезет");
		} else {
			System.out.println("не влезет");
		}

	}
}