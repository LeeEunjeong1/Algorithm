package Baekjoon.step5_sil1;

import java.util.Scanner;

public class three_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A<B) {
			if(A>C) {
				System.out.println(A);
			}
			else {
				if(C<B) {
					System.out.println(C);
				}else System.out.println(B);
			}
		}
		else {
			if(B>C) {
				System.out.println(B);
			}
			else {
				if(C<A) {
					System.out.println(C);
				}else System.out.println(A);
			}
		}
		sc.close();
	}
}
