import java.io.*;
import java.util.*;

class YottoMethod{
      Random rd = new Random();
      Scanner sc = new Scanner(System.in);
      int[] daze = new int[5];
      // int score;  //���v�_��
      // int allscore;	//�S���v�_��
      static String[] dispinfo = {"            �`���b�g �V�ѕ��`",
                           "�@�@��     �b                   ����                                    �b                  �_��",
                           " �`���C�X    |                   ������                                   |  ���̂Ƃ��o�Ă��邷�ׂẴT�C�R���̖�",
                           "�t�H�[�_�C�X | 4�̃T�C�R�����]����                                      �b �`���C�X�Ɠ���",
                           "�t���n�E�X   | 3�̃]���ځ{2�̃]���ځ@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@ �@�b �`���C�X�Ɠ���",
                           "S.�X�g���[�g | 4�̃T�C�R���̖ڂ��y 1 2 3 4 5 �z�̂悤�ɂȂ����Ă��� �@�b 15�_",
                           "B.�X�g���[�g | 5�̃T�C�R���̖ڂ��y 1 2 3 4 5 �z�̂悤�ɂȂ����Ă���@ �b 30�_",
                           "���b�g       | 5�̃T�C�R���̖ڂ��]���ځ@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�b 50�_"};

      

      public boolean question(){
            boolean TF;
            int n;
            do{
                  line_up(0);
                  System.out.print("\n�� ��������͂��ĉ�����  1 : �T�C�R����U�� 2 : �I��� ");
                  time(1000); //1�b��~
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
            time(1000); //1�b��~
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
            System.out.print("\n�y ");
            time(500); //0.5�b��~
            for(int k=0; k<5; k++){
                  System.out.print(daze[k] + " ");
                  time(500); //0.5�b��~
            }
            System.out.println("�z\n");
            time(1000); //1�b��~
      }



      public void remove(){
            System.out.println("�T�C�R����U��Ȃ������I");
            time(1000); //1�b��~
            System.out.print("��̖������Ȃ���s�v�Ȃ��̂�U��Ȃ������I(�ő���U��Ȃ����܂�)\n����U��Ȃ����܂����H(���ő�5��) ");
            int num;
            do{
                  num=Integer.parseInt(sc.next());
            }while(!(num>0&&num<=5));
            System.out.print("�O���牽�Ԗڂ̃T�C�R����U��Ȃ����܂����H");
            time(1000); //1�b��~
            System.out.println("1�`5����͂��ĉ������B");
            time(1000); //1�b��~
            int[] agains=new int[num];
            for(int i=0;i<num;i++){
                  System.out.print(i+1+"�� : ");
                  agains[i]=Integer.parseInt(sc.next());
                  if(agains[i]<1&&agains[i]>6){
                        i--;
                        continue;
                  }
            }
            for(int again:agains){
                  time(1000); //1�b��~
                  daze[again-1] = rd.nextInt(6)+1;
            }
      }

      public void time(int t){
            try{
                  Thread.sleep(t);
            }catch(InterruptedException e){
                  System.out.println("�G���[");
            }
      }

      public boolean stop(){
            System.out.print("�T�C�R�����m�肵�܂����H 1 : ������ 2 : �͂� ");
            do{
                  int st = sc.nextInt();
                  if(st==1){
                        System.out.println("�m�肵�܂���ł����B");
                        return false;
                  }else if(st==2){
                        return true;
                  }
                  System.out.println("�ǂ��炩���͂��Ă��������B");
            }while(true);
      }

      public void line_up(int disppattern){
            try{
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }catch(Exception e){
                System.out.println("�G���[");
            }
            
            if(disppattern==1){
                  for(int i=0 ; i<dispinfo.length ; i++){
                      System.out.println(dispinfo[i]);
                  }

                  
                  Arrays.sort(daze);
                  System.out.print("\n�y ");
                  time(500); //0.5�b��~
                  for(int k=0; k<5; k++){
                        System.out.print(daze[k] + " ");
                        time(500); //0.5�b��~
                  }
                  System.out.println("�z\n");
                  time(1000); //1�b��~
                  }
      }
}