package cs_week02;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class N_1931 {
	static int cnt = 1;
	static int maxCnt = -1;;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int room = Integer.parseInt(br.readLine());
		int start, end;
		ArrayList<schedule> list = new ArrayList<>();

		for(int i = 0; i < room; i++) {
			String arr = br.readLine();
			String[] info= arr.split(" ");
			start = Integer.parseInt(info[0]);
			end = Integer.parseInt(info[1]);
			list.add(new schedule(start, end));
		}
		Collections.sort(list);
		maxCnt(list, 0);
		
		
		System.out.println(maxCnt);
	}
	
	public static void maxCnt(ArrayList<schedule> list, int currentIndex) {
		 schedule sh = list.get(currentIndex);
		
		 for(int i = currentIndex; i < list.size(); i++) {
			if(sh.end <= list.get(i).start) {
				cnt++;
				maxCnt(list, i);
			} 
		 }
		 
		 if(maxCnt < cnt) {
			 maxCnt = cnt;
			// System.out.println(maxCnt);
			 return;
		 }
		 
		 cnt = 0;
		 
	}

}

