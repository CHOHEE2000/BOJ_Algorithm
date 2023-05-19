package cs_week02;
import java.io.*;
import java.util.*;
public class N_11399 {

	private static int[] time;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String arr = br.readLine();
		String[] timeArr = arr.split(" ");
		time = new int[timeArr.length];
		for(int i = 0; i < timeArr.length; i++) {
			time[i] = Integer.parseInt(timeArr[i]);
		}
		
		Arrays.sort(time);
		int sum = 0;
		for(int i = 0; i < time.length; i++) {
			sum += time[i] * (time.length-i);
		}
		
		System.out.println(sum);
	}

}
