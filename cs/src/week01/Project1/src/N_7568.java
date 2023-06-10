import java.util.Scanner;
public class N_7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int dungchi = 1;
				
		int[] w = new int[n];
		int[] h = new int[n];
		
		 for(int i=0; i<n; i++) 
	      {
	         w[i]=sc.nextInt();
	         h[i]=sc.nextInt();
	      }
		
		for(int i = 0; i < n; i++) {
			
			for(int j = 0; j < n; j++) {
				if(i != j) {
					if(w[i] < w[j] && h[i] < h[j]) 
						dungchi += 1;	
				}
						
			}
			System.out.print(dungchi + " ");
			dungchi = 1;
		}

		sc.close();
	}

}
