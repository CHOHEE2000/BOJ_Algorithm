import java.util.Scanner;
import java.util.ArrayList;

public class N1062 {
	public static int[] needTeach;//�����ľ��ϴ� ���ĺ� ����
	public static ArrayList<String> alphaCnt = new ArrayList<String>();;//�ߺ����� ���ĺ� ����(��ü)
	public static ArrayList<String> newArray = new ArrayList<String>();//��ŸƼī �� ������ �ߺ�����
	
	public static int countStr(String str) {//�ܾ�� antic ������ ���ĺ� ���� ��ȯ = �����ľ��ϴ� ���ĺ� ����
		String resultStr = "";
		int a, n, t, i, c;
		int num;
		
		 for(int j=0; j<str.length(); j++){    
		    	// ���� ���� �ε����� �ִ� ���� ������ �ε��� ��ȣ�� ��ȯ�Ѵ�.
		    	if(str.indexOf(str.charAt(j)) == j ) {
		            // ���� �����ϴ� �ε��� ���̶� i���� ���� ���� ����.
		            // �ߺ����� �ʰ� ���� ���� �� �ִ�.
		        	resultStr += str.charAt(j);
		        }
		    }
		//System.out.println(resultStr);
		
		resultStr = resultStr.replace(String.valueOf("a"), "");//resultStr���� antic ����
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
