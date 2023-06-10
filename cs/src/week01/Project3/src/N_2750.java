import java.util.Scanner;
import java.util.Arrays;

public class N_2750 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();		
		int[] arr = new int[num];

		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
