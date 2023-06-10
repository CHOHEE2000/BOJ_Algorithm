import java.util.Scanner;

public class N_2798 {
	static int sum = 0;
	static int max = -1;
	static int maxSum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n, r = 3, c;
		c = r;
		
		n = sc.nextInt();
		maxSum = sc.nextInt();
		
		int[] arr = new int[n];
		int[] copy = new int[r];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Combination(arr, copy, n, r, c);
		
		System.out.print(max);
		
		sc.close();

	}
	
	public static void print_arr(int[] copy, int n) {
		for (int i = 0; i < n; i++) {
			sum += copy[i];
		}

		if (sum > max && sum <= maxSum) {
			max = sum;
			sum = 0;
		}
		else
			sum = 0;
	}
	
	public static void Combination(int[] arr, int[] copy, int n, int r, int d) {
		if (r == 0) {
			print_arr(copy, d);
			return;
		}
		if (n < r) {
			return;
		}
		else {
			copy[r - 1] = arr[n - 1];
			Combination(arr, copy, n - 1, r - 1, d);
			Combination(arr, copy, n - 1, r, d);
		}
	}

}
