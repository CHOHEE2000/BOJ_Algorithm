import java.io.*;
import java.util.*;
public class N_10814 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = null;

		Map<Integer, String> arr = new HashMap<>();
		List<Integer> keySet = new ArrayList<>();
		
		int n = Integer.parseInt(br.readLine());
		String[] strSplit;
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			strSplit = str.split(" ");
			arr.put(Integer.parseInt(strSplit[0]), strSplit[1]);
		}
		
		Collections.sort(keySet);
		
		for(Integer key : keySet) {
			sb.append(key + " " + arr.get(key)).append("\n");
		}		
	}
}
