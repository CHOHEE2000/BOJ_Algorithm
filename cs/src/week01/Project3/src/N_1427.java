import java.util.Scanner;
import java.util.Arrays;
public class N_1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int jarisu = 11;
		int[] arr = new int[jarisu];
		int i, j;
		
		i = 0;
		while(n > 0) {
			arr[i] = n % 10;
			n /= 10;
			i++;
		}
		
		Arrays.sort(arr, 0, i);
		for(j = i-1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
	}

}
