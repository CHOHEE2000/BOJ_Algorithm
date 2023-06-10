import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
public class N_1620 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> list2 = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String[] list = new String[n];
		int m = Integer.parseInt(st.nextToken());
		String[] Q = new String[m];
		
		for(int i = 0; i < n; i++) {
			list[i] = br.readLine();	
			list2.put(list[i], i + 1);
		}
		for(int i = 0; i < m; i++)
			Q[i] = br.readLine();
		
		for(int i = 0; i < m; i++) {
			if(isStringInteger(Q[i], 10))
				sb.append(list[Integer.parseInt(Q[i]) - 1]).append("\n");
			else {
				Integer value = list2.get(Q[i]);
				sb.append(value).append("\n");
			}	
		}
		System.out.println(sb);
	}
	
	public static boolean isStringInteger(String stringToCheck, int radix) {
        if(stringToCheck.isEmpty()) return false;           //Check if the string is empty
        for(int i = 0; i < stringToCheck.length(); i++) {
            if(i == 0 && stringToCheck.charAt(i) == '-') {     //Check for negative Integers
                if(stringToCheck.length() == 1) return false;
                else continue;
            }
            if(Character.digit(stringToCheck.charAt(i),radix) < 0) return false;
        }
        return true;
    }
	
	 public static <K, V> K getKey(Map<K, V> map, V value) {
		 
	        for (K key : map.keySet()) {
	            if (value.equals(map.get(key))) {
	                return key;
	            }
	        }
	        return null;
	    }
}
