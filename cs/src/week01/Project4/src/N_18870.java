import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
public class N_18870 {
	static int cnt = 0;
//	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> clean = new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] arrCopy = new int[n];
		int i;
		
		st = new StringTokenizer(br.readLine());
		for(i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arrCopy[i] = arr[i];
		}
			
		Arrays.sort(arrCopy);
		
		clean.add(arrCopy[0]);
		for(i = 1; i < n; i++) {
			if(arrCopy[i] != arrCopy[i-1])
				clean.add(arrCopy[i]);	
		}
		
		for(i = 0; i < n; i++) {
			int aim = binarySearch(clean, arr[i], clean.size());
			sb.append(aim).append(" ");
		}
		System.out.println(sb);

	}
	
	public static int binarySearch(ArrayList<Integer> clean, int key, int n) {
		int mid;
		int low = 0, high = n-1;
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(key == clean.get(mid)) {
				return mid;
			} else if(key > clean.get(mid)) {
				low = mid+1;
			} else if(key < clean.get(mid)) {
				high = mid-1;
			}
		}
		return -1;
	}
}
