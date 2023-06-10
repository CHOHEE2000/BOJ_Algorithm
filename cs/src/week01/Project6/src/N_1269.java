import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
public class N_1269 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strSplit = str.split(" ");
		int n = Integer.parseInt(strSplit[0]);
		int m = Integer.parseInt(strSplit[1]);
		int cnt = 0;
		
		HashSet<Integer> a = new HashSet<>();
		str = br.readLine();
		strSplit = str.split(" ");
		for(int i = 0; i < n; i++)
			a.add(Integer.parseInt(strSplit[i]));
		
		ArrayList<String> b = new ArrayList<>();
		str = br.readLine();
		strSplit = str.split(" ");
		for(int i = 0; i < m; i++) {
			int tmp = Integer.parseInt(strSplit[i]);
			if(a.contains(tmp)) 
				cnt++;	
		}
		
		int ans = m + n - (cnt * 2);
		System.out.print(ans);
	}
}
