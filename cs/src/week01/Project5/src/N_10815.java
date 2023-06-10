import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class N_10815 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int i;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			int aim = binarySearch(arr, key, arr.length);
			
			if(aim == -1)
				System.out.print(0 + " ");
			else
				System.out.print(1 + " ");
		}	
	}
	
	public static int binarySearch(int[] arr, int key, int n) {
		int mid;
		int low = 0, high = n-1;
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(key == arr[mid]) {
				return mid;
			} else if(key > arr[mid]) {
				low = mid+1;
			} else if(key < arr[mid]) {
				high = mid-1;
			}
		}
		return -1;
	}
}
