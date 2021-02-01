package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double sum = 0;


		System.out.println("¬ведите a = ");
		a = sc.nextDouble();
		System.out.println("¬ведите b = ");
		b = sc.nextDouble();
		System.out.println("¬ведите c = ");
		c = sc.nextDouble();
		System.out.println("¬ведите d = ");
		d = sc.nextDouble();
		sc.close();

		sum = (a * b / c * d) - (a * b - c / c * d);

		System.out.println("значение выражени€ = " + sum);

	}

}
