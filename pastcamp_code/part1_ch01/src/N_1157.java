import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class N_1157 {//문서에 단어가 최대 몇 번 중복되지 않게 등장하는지 구하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String doc = br.readLine();
        String word = br.readLine();

        int lastIdx = 0;
        int cnt = 0;

        int i = 0;
        //System.out.print(doc.indexOf(word, 8));
        while(i != doc.length()){
            if(doc.indexOf(word,i) == i){
                cnt++;
                i = i+word.length();
            }else
                i++;
        }

        System.out.print(cnt);
    }
}