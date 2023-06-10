import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
public class N_14425 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashSet<String> search = new HashSet<String>();
		int n, m;
		int cnt = 0;
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++)
			search.add(br.readLine());
		
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			if(search.contains(str))
				cnt++;
		}
		
		System.out.println(cnt);
	}
}
