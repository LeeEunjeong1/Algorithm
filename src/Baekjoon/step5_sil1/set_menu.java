package Baekjoon.step5_sil1;

import java.util.Scanner;

public class set_menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hamburger = 2001;
		int cola = 2001;

		for (int i = 0; i < 3; i++) {
			int value = sc.nextInt();
			if (value < hamburger) {
				hamburger = value;
			}
		}
		for (int i = 0; i < 2; i++) {
			int value = sc.nextInt();
			if (value < cola) {
				cola = value;
			}

		}
		System.out.println(hamburger + cola - 50);
	}

}
