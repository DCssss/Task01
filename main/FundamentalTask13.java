package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask13 {
	public static void main(String[] args) {
		int a = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� = ");
		a = sc.nextInt();
		sc.close();

		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
	}
}