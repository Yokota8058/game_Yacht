
import java.io.*;
import java.util.*;

class YottoMain{
      public static void main (String args[])throws InterruptedException{
            YottoMethod ym = new YottoMethod();
            Random rd = new Random();
            Scanner sc = new Scanner(System.in);
            // int score;  //���v�_��
            // int allscore;	//�S���v�_��
            boolean TF;
            TF = ym.question();
      
            if(TF){
                  ym.roll();  //����
                  ym.line_up(1);
                  for(int i=0;i<2&&!ym.stop();i++){
                        ym.remove();      //����
                        ym.line_up(1);
                  }
                  System.out.print("�T�C�R�����m�肵�܂��B");
            }
            else{
                  System.out.println("�v���O�������I�����܂��B");
            }
      }
}