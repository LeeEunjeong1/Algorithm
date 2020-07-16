package Step3_for;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1;i<=9;i++) {
			int gu = N*i;
			
			System.out.println(N+" * "+i+" = "+gu);
		}
	}

}
