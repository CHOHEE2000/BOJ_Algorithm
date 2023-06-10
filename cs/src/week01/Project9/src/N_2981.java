import java.io.*;
import java.util.Arrays;
public class N_2981 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int aim;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		
		aim = aim(arr);

		for(int i = 2; i <= aim; i++) {
			if(aim % 2 == 0) {
				if(aim % i == 0 && i % 2 == 0)
					sb.append(i).append(" ");		
			}else
				if(aim % i == 0)
					sb.append(i).append(" ");
		}
		
		System.out.println(sb);
	}
	public static int aim(int[] arr) {
		int min = 1000000;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(min >= (arr[j]-arr[i]))
					min = (arr[j]-arr[i]);
			}
		}
		
		return min;
	}
}
