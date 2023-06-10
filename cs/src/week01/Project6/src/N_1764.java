import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class N_1764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] strSplit = str.split(" ");
		int n = Integer.parseInt(strSplit[0]);
		int m = Integer.parseInt(strSplit[1]);
		int cnt = 0;
		
		HashSet<String> ddmh = new HashSet<>();	
		for(int i = 0; i < n; i++) {
			ddmh.add(br.readLine());
		}
		
		ArrayList<String> ans = new ArrayList<>();
		for(int i = 0; i < m; i++) {
			String tmp = br.readLine();
			if(ddmh.contains(tmp)) {
				cnt++;
				ans.add(tmp);
			}
		}
		
		Collections.sort(ans);
		
		System.out.println(cnt);
		for(String ss : ans)
			System.out.println(ss);
	}
}
