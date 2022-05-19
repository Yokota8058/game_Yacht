import java.io.*;
import java.util.*;

class YottoMethod{
      Random rd = new Random();
      Scanner sc = new Scanner(System.in);
      int[] daze = new int[5];
      // int score;  //合計点数
      // int allscore;	//全合計点数
      static String[] dispinfo = {"            ～ヨット 遊び方～",
                           "　　役名     ｜                   条件                                    ｜                  点数",
                           " チョイス    |                   無条件                                   |  そのとき出ているすべてのサイコロの目",
                           "フォーダイス | 4つのサイコロがゾロ目                                      ｜ チョイスと同じ",
                           "フルハウス   | 3つのゾロ目＋2つのゾロ目　　　　　　　　　　　　　　　　 　｜ チョイスと同じ",
                           "S.ストレート | 4つのサイコロの目が【 1 2 3 4 5 】のようにつながっている 　｜ 15点",
                           "B.ストレート | 5つのサイコロの目が【 1 2 3 4 5 】のようにつながっている　 ｜ 30点",
                           "ヨット       | 5つのサイコロの目がゾロ目　　　　　　　　　　　　　　　　　｜ 50点"};

      

      public boolean question(){
            boolean TF;
            int n;
            do{
                  line_up(0);
                  System.out.print("\n★ 数字を入力して下さい  1 : サイコロを振る 2 : 終わる ");
                  time(1000); //1秒停止
                  n=sc.nextInt();
                  if(n==1){
                        TF=true;
                  }else if(n==2){
                        TF=false;
                  }else{
                        continue;
                  }
                  break;
            }while(true);
            line_up(0);
            time(1000); //1秒停止
            return TF;
      }

      public void roll(){
            for(int i=0; i<5; i++){
                  daze[i] = rd.nextInt(6)+1;
            }
      }

      public void line_up(){
            line_up(1);
            Arrays.sort(daze);
            System.out.print("\n【 ");
            time(500); //0.5秒停止
            for(int k=0; k<5; k++){
                  System.out.print(daze[k] + " ");
                  time(500); //0.5秒停止
            }
            System.out.println("】\n");
            time(1000); //1秒停止
      }



      public void remove(){
            System.out.println("サイコロを振りなおそう！");
            time(1000); //1秒停止
            System.out.print("上の役を見ながら不要なものを振りなおそう！(最大二回振りなおせます)\n何個を振りなおしますか？(※最大5個) ");
            int num;
            do{
                  num=Integer.parseInt(sc.next());
            }while(!(num>0&&num<=5));
            System.out.print("前から何番目のサイコロを振りなおしますか？");
            time(1000); //1秒停止
            System.out.println("1～5を入力して下さい。");
            time(1000); //1秒停止
            int[] agains=new int[num];
            for(int i=0;i<num;i++){
                  System.out.print(i+1+"個目 : ");
                  agains[i]=Integer.parseInt(sc.next());
                  if(agains[i]<1&&agains[i]>6){
                        i--;
                        continue;
                  }
            }
            for(int again:agains){
                  time(1000); //1秒停止
                  daze[again-1] = rd.nextInt(6)+1;
            }
      }

      public void time(int t){
            try{
                  Thread.sleep(t);
            }catch(InterruptedException e){
                  System.out.println("エラー");
            }
      }

      public boolean stop(){
            System.out.print("サイコロを確定しますか？ 1 : いいえ 2 : はい ");
            do{
                  int st = sc.nextInt();
                  if(st==1){
                        System.out.println("確定しませんでした。");
                        return false;
                  }else if(st==2){
                        return true;
                  }
                  System.out.println("どちらか入力してください。");
            }while(true);
      }

      public void line_up(int disppattern){
            try{
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }catch(Exception e){
                System.out.println("エラー");
            }
            
            if(disppattern==1){
                  for(int i=0 ; i<dispinfo.length ; i++){
                      System.out.println(dispinfo[i]);
                  }

                  
                  Arrays.sort(daze);
                  System.out.print("\n【 ");
                  time(500); //0.5秒停止
                  for(int k=0; k<5; k++){
                        System.out.print(daze[k] + " ");
                        time(500); //0.5秒停止
                  }
                  System.out.println("】\n");
                  time(1000); //1秒停止
                  }
      }
}