package cs_week01;
import java.io.*;
import java.util.*;
public class N_4195 {
	static ArrayList<String> nameList = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			int relation = Integer.parseInt(br.readLine());
			Graph g = new Graph(10000);
			for(int j = 0; j < relation; j++) {
				g.cnt = 0;
				String arr = br.readLine();
				String[] nameArr = arr.split(" ");
				g.addEdge(changeFriendsToIndex(nameArr[0]), changeFriendsToIndex(nameArr[1]));
				//System.out.println("--" + changeFriendsToIndex(nameArr[0]));
				g.DFS(0);
				System.out.println(g.cnt);
			}	
			
		}
	}
	
	
	public static int changeFriendsToIndex(String name) {
		int index;
		
		if(nameList.isEmpty()) {
			nameList.add(name);
			index = 0;
		} else if(nameList.contains(name)) {
			index = nameList.indexOf(name);
		} else {
			nameList.add(name);
			index = nameList.indexOf(name);
		}
		
		return index;
	}

}
