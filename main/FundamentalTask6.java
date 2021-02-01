package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask6 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int sum;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a = ");
		a = sc.nextInt();
		System.out.println("Введите b = ");
		b = sc.nextInt();
		sc.close();

		c = 360 - (a + b);
		sum = a + b + c;

		if ((sum <= 360) & (sum >= 0) & (a > 0) & (b > 0) & (c > 0)) {

			if (a == 90 || b == 90 || c == 90) {
				System.out.println("Треугольник прямоугольный");
			} else {
				System.out.println("Другой треугольник");

			}
		} else {
			System.out.println("Треугольник не существует");
		}

	}

}