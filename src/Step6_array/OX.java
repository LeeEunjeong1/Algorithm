package Step6_array;

import java.util.Arrays;
import java.util.Scanner;

public class OX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] array = new String[N];
		for(int i=0;i<N;i++) {
		
			array[i] = sc.next();
		}
		sc.close();
		
		for(int i=0;i<array.length;i++) {	
			int score = 0, count = 0;
			for(int j = 0;j<array[i].length();j++) {
				if(array[i].charAt(j) == 'O')
					score += ++count;
				else count = 0;
			}
			System.out.println(score);
		}
	
	
	}


}
