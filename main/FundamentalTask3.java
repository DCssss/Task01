package by.fundamentaltask.java.main;

import java.util.Scanner;

public class FundamentalTask3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = 0;
		double kb = 0;
		double mb = 0;
		double gb = 0;

		System.out.println("¬ведите a = ");
		a = sc.nextDouble();
		sc.close();

		kb = a / 1024;
		mb = kb / 1024;
		gb = mb / 1024;

		System.out.println("Kb = " + kb);
		System.out.println("Mb = " + mb);
		System.out.println("Gb = " + gb);
	}

}
