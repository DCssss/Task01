package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask11 {
	public static void main(String[] args) {

		double a;
		double b;
		double x;
		double y;
		double h;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� a = ");
		a = sc.nextDouble();
		System.out.println("������� b = ");
		b = sc.nextDouble();
		System.out.println("������� h = ");
		h = sc.nextDouble();
		sc.close();

		for (x = a; x <= b; x += h) {
			if (x <= 2) {
				y = -x;
				System.out.println(y);
			} else {
				y = x;
				System.out.println(y);
			}
		}
	}
}