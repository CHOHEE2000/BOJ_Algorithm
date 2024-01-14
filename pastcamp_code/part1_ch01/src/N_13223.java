import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.SimpleDateFormat;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class N_13223 {//시간계산
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String current = br.readLine();
        String action = br.readLine();

        String[] str = current.split(":");
        String[] str1 = action.split(":");
        int[] currentTime = {Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])};
        int[] actionTime = {Integer.parseInt(str1[0]), Integer.parseInt(str1[1]), Integer.parseInt(str1[2])};
        int carry;

        int[] rsltTime = new int[3];

        for(int i = 2; i >= 0; i--){
            if(currentTime[i] > actionTime[i]){
                if(i == 0){
                    rsltTime[i] = (actionTime[i]+24) - currentTime[i];
                }else{
                    rsltTime[i] = (actionTime[i]+60) - currentTime[i];
                    actionTime[i-1] -= 1;
                }
            }else{
                rsltTime[i] = actionTime[i]-currentTime[i];
            }
        }

        String[] strDate = new String[3];
       for(int i = 0; i < 3; i++){
           if(rsltTime[i] < 10)
               strDate[i] = "0" + String.valueOf(rsltTime[i]);
           else if(rsltTime[i] > 10)
               strDate[i] = String.valueOf(rsltTime[i]);
           else
               strDate[i] = "00";

       }

        System.out.print(strDate[0] + ":" + strDate[1] + ":" + strDate[2]);
    }
}