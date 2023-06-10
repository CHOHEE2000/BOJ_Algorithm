import java.util.Scanner;
public class N_1436 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String jongmal = "666";
		int n = sc.nextInt();
		int cnt = 1;
		int num = 666;
		
		while(cnt != n) {
			num++;
			if(String.valueOf(num).contains(jongmal)) {
				cnt++;
			}
		}
		System.out.println(num);		
	}

}
