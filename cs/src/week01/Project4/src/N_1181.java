import java.util.*;
public class N_1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++) 
			arr[i] = sc.next();
		
// Comparator<? super T> c 여기서 Comparator은 두 객체를 비교해 위치를 바꿀지 말지 판단하면서 정렬
// T = Type(객체, 자료형 등등 타입 설정), 물음표는 신경x
		Arrays.sort(arr, new Comparator<String>() {
			
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length())
					return s1.compareTo(s2);
				else
					return s1.length() - s2.length();
				}
		});
		System.out.println(arr[0]);
		for(int i = 1; i < n; i++) {
			if(!arr[i].equals(arr[i-1]))
				System.out.println(arr[i]);
		}
		sc.close();
	}
}
