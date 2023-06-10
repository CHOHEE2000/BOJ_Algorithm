import java.util.*;
import java.io.*;

public class N_11478 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i, j;
		String str = br.readLine();
		
		HashSet<String> arr = new HashSet<>();
		
		for(i = 0; i <= str.length(); i++) {
			for(j = i + 1; j <= str.length(); j++) {
				if(!arr.contains(str.substring(i, j)))
					arr.add(str.substring(i, j));
			}
		}
		System.out.println(arr.size());
	}
}
