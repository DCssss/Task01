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
		System.out.println("������� A = ");
		a = sc.nextInt();
		System.out.println("������� B = ");
		b = sc.nextInt();
		System.out.println("������� x = ");
		x = sc.nextInt();
		System.out.println("������� y = ");
		y = sc.nextInt();
		System.out.println("������� z = ");
		z = sc.nextInt();
		sc.close();

		if (((a >= x) & (b >= y)) || ((a >= y) & (b >= x)) || ((a >= x) & (b >= z)) || ((a >= z) & (b >= x))
				|| (((a >= z) & (b >= y)) || ((a >= y) & (b >= z)))) {
			System.out.println("������");
		} else {
			System.out.println("�� ������");
		}

	}
}