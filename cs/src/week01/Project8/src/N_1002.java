import java.io.*;
public class N_1002 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] strS = str.split(" ");
			check(Integer.parseInt(strS[0]), Integer.parseInt(strS[1]), Integer.parseInt(strS[2]), Integer.parseInt(strS[3]), Integer.parseInt(strS[4]), Integer.parseInt(strS[5]));
		}
	}
	
	public static void check(int x1, int y1, int r1, int x2, int y2, int r2) {		
		int rMin = (r1 <= r2 ? r1 : r2);
		int rMax = (r1 <= r2 ? r2 : r1);
		double d = Math.sqrt((Math.pow(y1-y2, 2)) + (Math.pow(x1-x2, 2))); //두점사이 거리
		
		if(x1 == x2 && y1 == y2) {//두점이 같을 떄
			if(rMin == rMax)//반지름 같으면
				System.out.println("-1");
			else//반지름 다르면
				System.out.println("0");
		}
		else{//두점이 다를 때
			if(rMax - rMin < d && d < rMax + rMin)
				System.out.println("2");
			else if(rMax + rMin == d || rMax - rMin == d)
				System.out.println("1");
			else if(rMax + rMin < d || rMax - rMin > d)
				System.out.println("0");
		}
	}
}
