package cs_week01;
import java.io.*;
import java.util.*;
public class N_1300 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		int n = Integer.parseInt(N+1);
		String K = br.readLine();
		int k = Integer.parseInt(K+1);
		
		int nn  = n*n;
		int[] arrB = new int[nn+1];
		
		int i, j, l = 1;
		for(i = 1; i <= n; i ++) {
			for(j = 1; j <= n; j++) {
				arrB[l++] = (i*j);
				//System.out.println(i*j);
				//System.out.println("--" + arrB[l-1]);
			
				if(l-1 >= k) {
					Arrays.sort(arrB);
					System.out.println(arrB[k]);	
					return;
				}
			}
		}
		
		//System.out.println(arrB[k-1]);
		
	}

	static int binarySearch1(int key, int low, int high, int[] arr) {
		int mid;
		
		if(low <= high) {
			mid = (low + high) / 2;
			
			if(key == arr[mid]) { // 탐색 성공 
				return mid;
			} else if(key < arr[mid]) {
				return binarySearch1(key ,low, mid-1, arr); // 왼쪽 부분 탐색 
			} else {
				return binarySearch1(key, mid+1, high, arr); // 오른쪽 부분 탐색 
			}
		}
		
		return -1; // 탐색 실패 
	}
}
