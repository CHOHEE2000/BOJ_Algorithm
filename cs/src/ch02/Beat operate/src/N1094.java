import java.util.Scanner;

public class N1094 {
	public static int stick = 64;
	public static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while(x != 0) {
			if(stick > x)
				stick /= 2;
			else {
				cnt++;
				x -= stick;
			}
		}
		
		System.out.print(cnt);
		
		sc.close();

	}

}
