import java.io.*;
import java.util.Arrays;
public class N_4153 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		
		String str = br.readLine();
		while(!str.equals("0 0 0")) {
			String[] strS = str.split(" ");
			for(int i = 0; i < 3; i++)
				arr[i] = Integer.parseInt(strS[i]);
			Arrays.sort(arr);
			check(arr);
			str = br.readLine();
		}
	}
	
	public static void check(int[] arr) {
		int a = (int) Math.pow(arr[0], 2);
		int b = (int) Math.pow(arr[1], 2);	
		int c = (int) Math.pow(arr[2], 2);
		
		if(c == a + b)
			System.out.println("right");
		else
			System.out.println("wrong");
	}

}
