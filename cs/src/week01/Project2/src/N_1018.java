import java.util.Scanner;
public class N_1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int change1 = 0, change2 = 0, minChange = 70;
		int i, j, k, l;
		
		char[][] inputArr = new char[n][m];
		char[][] standardArr1 = new char[n][m];
		char[][] standardArr2 = new char[n][m];
		
		for(i = 0; i < n; i++) { 
				String input = sc.next();
				for(j = 0; j < m ; j++) {
					inputArr[i][j] = input.charAt(j);
				}
			}
		
		for(i = 0; i < n; i++) {
			for(j = 0; j < m; j++) {
				if((i+j) % 2 == 0) {
					standardArr1[i][j] = 'W';
					standardArr2[i][j] = 'B';
				}
				else {
					standardArr1[i][j] = 'B';
					standardArr2[i][j] = 'W';
				}
			}
		}
		
		for(i = 0; i <= n-8; i++) {
			for(j = 0; j <= m-8; j++) {
				
				for(k = i; k < i+8; k++) {
					for(l = j; l < j+8; l++) {
						if(inputArr[k][l] != standardArr1[k][l])
							change1++;
						
						if(inputArr[k][l] != standardArr2[k][l])
							change2++;
					}
				}
				if(minChange > (change1 < change2 ? change1 : change2))
					minChange = change1 < change2 ? change1 : change2;
				
				change1 = 0;
				change2 = 0;
				
			}
		}
		System.out.print(minChange);
		
		sc.close();
	}
}
