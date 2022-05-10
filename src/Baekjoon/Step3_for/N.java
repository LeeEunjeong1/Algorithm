package Baekjoon.Step3_for;

import java.util.Scanner;

public class N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		/*
		for(int i = 1;i<=N;i++) {
			System.out.println(i);
		}
		*/
		for(int i = N;i>=1;i--) {
			System.out.println(i);
		}
		sc.close();
	}

}
