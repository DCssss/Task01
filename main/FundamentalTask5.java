package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask5 {

	public static void main(String[] args) {
		int a;
		int b;
		int min = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите  a = ");
		a = sc.nextInt();
		System.out.println("¬ведите b = ");
		b = sc.nextInt();
		sc.close();
		if (a < b) {
			min = a;
			System.out.println("ћеньшее число = " + min);
		}

		if (a > b) {
			min = b;
			System.out.println("ћеньшее число = " + min);
		}

		if (a == b) {
			System.out.println(" a и b равны");
		}

	}
}
