import java.util.Scanner;

public class N_9663 {
	
	public static int[] main;
	public static int[] diag1;
	public static int[] diag2;
	public static int num;
	public static int cnt = 0;
	
	public static void search(int y) {
		if(y == num) {
			cnt++;
			return;
		}
		for(int x = 0; x < num; x++) {
			if(main[x] || diag1[x+y] || diag2[x-y+num-1]) continue;
			main[x] = diag1[x+y] = diag2[x-y+num-1] = 1;
			search(y+1);
			main[x] = diag1[x+y] = diag2[x-y+num-1] = 0;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		main = new int[num];
		diag1 = new int[num];
		diag2 = new int[num];
		
		search(0);
		System.out.println(cnt);
		
		input.close();
	}

}
