package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double sum = 0;
		double num = 0;
		double den = 0;

		System.out.println("¬ведите a = ");
		a = sc.nextDouble();
		System.out.println("¬ведите b = ");
		b = sc.nextDouble();
		System.out.println("¬ведите c = ");
		c = sc.nextDouble();
		sc.close();

		num = b + Math.sqrt(b * b + 4 * a * c);
		den = 2 * a;

		sum = num / den - a * a * a * c + 1 / b * b;

		System.out.println("значение выражени€ = " + sum);

	}

}
