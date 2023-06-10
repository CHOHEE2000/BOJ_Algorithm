import java.util.Scanner;
public class N_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num, x, cx;
		int sum = 0;
		
		num = sc.nextInt();
		
		for(x = 1; x <= num; x++) {
			cx = x;
			while(cx > 0) {
				sum += cx % 10;
				cx /= 10;
			}
			sum += x;
			
			if(sum == num) {
				System.out.println(x);
				break;
			}

			sum = 0;	
		}
		if(x == num+1)
			System.out.println("0");

		sc.close();
	}

}
