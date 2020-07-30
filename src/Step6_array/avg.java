package Step6_array;

import java.util.Arrays;
import java.util.Scanner;
public class avg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[N];
		int sum = 0;
		for(int i=0;i<N;i++) {
			array[i] = sc.nextInt();
			sum+=array[i];
		}
		Arrays.sort(array);
		
		System.out.println(sum*100.0/array[N-1]/N);

	}

}
