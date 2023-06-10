import java.util.Scanner;
import java.util.ArrayList;

public class N1062 {
	public static int[] needTeach;//가르쳐야하는 알파벳 개수
	public static ArrayList<String> alphaCnt = new ArrayList<String>();;//중복없이 알파벳 종류(전체)
	public static ArrayList<String> newArray = new ArrayList<String>();//안타티카 뺀 나머지 중복없이
	
	public static int countStr(String str) {//단어에서 antic 제거한 알파벳 갯수 반환 = 가르쳐야하는 알파벳 갯수
		String resultStr = "";
		int a, n, t, i, c;
		int num;
		
		 for(int j=0; j<str.length(); j++){    
		    	// 제일 앞쪽 인덱스에 있는 같은 문자의 인덱스 번호를 반환한다.
		    	if(str.indexOf(str.charAt(j)) == j ) {
		            // 최초 등장하는 인덱스 갑이랑 i값이 같을 때만 추출.
		            // 중복되지 않게 값을 얻을 수 있다.
		        	resultStr += str.charAt(j);
		        }
		    }
		//System.out.println(resultStr);
		
		resultStr = resultStr.replace(String.valueOf("a"), "");//resultStr에서 antic 삭제
		resultStr = resultStr.replace(String.valueOf("n"), "");
		resultStr = resultStr.replace(String.valueOf("t"), "");
		resultStr = resultStr.replace(String.valueOf("i"), "");
		resultStr = resultStr.replace(String.valueOf("c"), "");

		
		newArray.add(resultStr);
        
        return resultStr.length()-5;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		int N, K;
		String str = "";
		int i, j, k, cnt;
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		for(i = 0; i < N; i++) {
			array.add(sc.next());
		}
		for(i = 0; i < N; i++) {
			countStr(array.get(i)); 
		}
		
	/*	for(String a : newArray) {
		    System.out.println(a);
		}*/
		k = 0;
		for(i = 0; i < newArray.size(); i++) {
			str = newArray.get(i);
			for(j = 0; j < str.length(); j++) {
				alphaCnt[k++] = str[j];
			}
		}
		
	}

}
