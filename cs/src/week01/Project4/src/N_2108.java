import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class N_2108 {
// 백준 예제 4번 넣었을때 -0이 나옴 왜??
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		sansul(n, arr);
		System.out.println(arr[n/2]);
		choibin(n, arr);
		System.out.println((arr[n-1]-arr[0]));
	}
	
	public static void sansul(int n, int[] arr) {
		double sum = 0.000;
		
		for(int i = 0; i < n; i++) {
			sum += arr[i];
			}
		sum = sum/n;
		System.out.println(Math.round(sum));
	}
	
	public static void choibin(int n, int[] arr) {
		int[] cnt = new int[8001];
		int[] choiArr = new int[n];
		int max = -1, answer = 0, j = 0;
		int flag = 0;
		
		for(int i = 0; i < n; i++) 
			cnt[arr[i] + 4000]++;
		
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
				answer = i - 4000;
			}
		}
		
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i] != 0 && cnt[i] == max) {
				flag++;
				choiArr[j++] = i - 4000;
				}
		}
			
		if(flag == 1)
			System.out.println(answer);
		else
			System.out.println(choiArr[1]);

	}	
	
}
