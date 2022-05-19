
import java.io.*;
import java.util.*;

class YottoMain{
      public static void main (String args[])throws InterruptedException{
            YottoMethod ym = new YottoMethod();
            Random rd = new Random();
            Scanner sc = new Scanner(System.in);
            // int score;  //合計点数
            // int allscore;	//全合計点数
            boolean TF;
            TF = ym.question();
      
            if(TF){
                  ym.roll();  //一回目
                  ym.line_up(1);
                  for(int i=0;i<2&&!ym.stop();i++){
                        ym.remove();      //二回目
                        ym.line_up(1);
                  }
                  System.out.print("サイコロを確定します。");
            }
            else{
                  System.out.println("プログラムを終了します。");
            }
      }
}