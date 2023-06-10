import java.util.Arrays;
import java.util.Scanner;

public class N_11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();		
		}
		
		Arrays.sort(arr, (e1, e2) ->{
			if(e1[0] == e2[0]) {// 첫번째 원소가 같다면 
				return e1[1] - e2[1];
			}
			else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}	

		sc.close();
	}
}
