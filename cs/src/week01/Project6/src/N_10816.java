import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class N_10816 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
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
			
			int first = binarySearch(arr, key, arr.length, 1);
			int last = binarySearch(arr, key, arr.length, 0);
			
			int cnt = last - first + 1;
			
			if(first != -1)
				sb.append(cnt).append(" ");
			else
				sb.append(0).append(" ");
		}	
		System.out.print(sb);
	}
	
	public static int binarySearch(int[] arr, int key, int n, int searchFirst) {
		int low = 0, high = n-1;
		int result = -1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(key == arr[mid]) {
				result = mid;	
				if(searchFirst == 1)
					high = mid - 1;
				else
					low = mid + 1;
			} else if(key > arr[mid]) {
				low = mid+1;
			} else if(key < arr[mid]) {
				high = mid-1;
			}
		}
		return result;
	}
}

