package cs_week03;

import java.util.*;
public class N_2667 {
	static int N; // 지도의 크기
	static int[][] Map; // 2차원 배열 지도
	static int count; // 단지집의 숫자
	static int[] dr = {-1,1,0,0}; //상하좌우
	static int[] dc = {0,0,-1,1}; //상하좌우
	
	static ArrayList<Integer> result; // 단지 집의 수 저장 result.size()는 단지 수가 된다.
	
	static boolean[][] check; // 방문 체크

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 지도의 크기

		//2차원 배열 지도
		Map = new int[N][N];
		
		//방문 체크
		check = new boolean[N][N];
		
		//지도 배열 값 입력
		for(int i=0;i<N;i++) {
			String input = sc.next();
			for(int j=0;j<N;j++) {
				Map[i][j] = input.charAt(j)-'0';
			}
		}
		
		//단지집의 숫자
		count = 0;

		//단지 집의 수 결과 저장
		result = new ArrayList<>();
		
		//지도 전체 탐색
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				//현재 위치의 값이 1이고 true라면
				if(Map[i][j]==1 && !check[i][j]) {
					//맨 처음이기 때문에 count 1 증가
					count=1;
					Search(i,j);
					result.add(count);
				}
			}
		}
		
		Collections.sort(result);
		System.out.println(result.size());
		for(int c : result) System.out.println(c);
	}
	
	public static int Search(int x, int y) {
		check[x][y] = true;
		
		//4방향 확인
		for(int i=0;i<4;i++) {
			int nx = x + dr[i];
			int ny = y + dc[i];
			
			if(nx>=0 && ny>=0 && nx<N && ny<N) {
				if(Map[nx][ny]==1 && !check[nx][ny]) {
					
					Search(nx,ny);
					count++;
				}
			}
		}
		
		return count;
	}
}
