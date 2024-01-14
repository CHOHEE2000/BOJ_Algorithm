import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class N_2744 { // 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        String word = br.readLine();

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90)
                System.out.print((char)(word.charAt(i)+32));
            else
                System.out.print((char)(word.charAt(i)-32));
        }

    }
}