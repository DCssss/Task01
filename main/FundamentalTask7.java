package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask7 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� a = ");
		a = sc.nextInt();
		System.out.println("������� b = ");
		b = sc.nextInt();
		System.out.println("������� c = ");
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