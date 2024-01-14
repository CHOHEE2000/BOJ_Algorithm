import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1919 {
    public static void main(String[] args) throws IOException { //두 단어가 서로 애너그램 관계에 있도록 만들기 위해서 제거해야 하는 최소 개수의 문자 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        //int maxLen = Math.max(a.length(), b.length());
        int cnt = 0;

        int[] aCnt = new int[26];
        int[] bCnt = new int[26];

        int i = 0;
        while(i != a.length()){
            aCnt[(int)(a.charAt(i))-97]++;
            i++;
        }

        i = 0;
        while(i != b.length()){
            bCnt[(int)(b.charAt(i))-97]++;
            i++;
        }

        for(i = 0; i < 26; i++){
            if(aCnt[i] != bCnt[i])
                cnt += Math.abs(bCnt[i]-aCnt[i]);
        }

        System.out.print(cnt);
    }
}
