import java.util.Scanner;

public class N_1182 {
	
	public static int[] arr;
	public static int[] chosen;//result
	public static int[] op;//target
	public static int N, S, cnt = 0, sum = 0, ans = 0;
	public static int i;
	
	public static void search(int cnt) {
		if (cnt == N) {
			for(i = 0; i < N; i++) {
				if(chosen[i] == 0)
					sum -= arr[i];
				else
					sum += arr[i];
			}
			if(sum == S)
				ans++;
			return;
		}
		for (int i = 0; i < 2; i++) {
			chosen[cnt] = op[i];
			search(cnt + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		N = input.nextInt();
		S = input.nextInt();
		
		arr = new int[N];
		chosen = new int[N];
		op = new int[] {0, 1};
		for(i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		search(0);
		System.out.println(ans);
		
		input.close();
	}

}
