package cs_week02;
import java.io.*;
import java.util.Arrays;

public class N_2110 {
	
	public static int[] houseIndex;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String info = br.readLine();
		String[] arr = info.split(" ");
		
		int house = Integer.parseInt(arr[0]);
		int wifi = Integer.parseInt(arr[1]);
		
		houseIndex = new int[house];
		for(int i = 0; i < house; i++) {
			houseIndex[i] = Integer.parseInt(br.readLine());	
		}
		Arrays.sort(houseIndex);
		
		int low = 1;
		int high = houseIndex[house-1] - houseIndex[0] + 1;
		
		while(low < high) {
			int mid = (low+high)/2;
			
			if(canInstall(mid) < wifi) {
				high = mid;
				
			}
			else { 
				low = mid+1;
				//System.out.println("1");
			}
			
		}
		System.out.println(low-1);
		
	}
	
	public static int canInstall(int d) {
		int cnt = 1;
		int lastLocate = houseIndex[0];
		
		for(int i = 1; i < houseIndex.length; i++) {
			int locate = houseIndex[i];
			if(locate - lastLocate >= d) {
				cnt++;
				lastLocate = locate;
			}
		}
		
		return cnt;
	}

}
