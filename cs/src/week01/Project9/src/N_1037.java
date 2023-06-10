import java.io.*;
import java.util.*;
public class N_1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		String str = br.readLine();
		for(int i = 0; i < n; i++) {
			String[] strS = str.split(" ");
			arr[i] = Integer.parseInt(strS[i]);
		}
		Arrays.sort(arr);
		
		if(arr.length != 1) 
			A = arr[0]*arr[arr.length-1];
		else
			A = arr[0]*arr[0];
		
		System.out.println(A);
	}
}
