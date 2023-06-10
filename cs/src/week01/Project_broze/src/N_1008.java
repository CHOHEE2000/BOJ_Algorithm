import java.io.*;
public class N_1008 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		String[] str = input.split(" ");
		
		double a = Integer.parseInt(str[0]);
		double b = Integer.parseInt(str[1]);
		
		double result = a/b;
		
		System.out.println(result);
				
	}

}
