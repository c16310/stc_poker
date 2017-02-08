/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porkergame;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author c16310
 */
public class Pokers {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] card = {"S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8",
            "S9", "S10", "SJ", "SQ", "SK", //スペードの1から13のカード
            "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", 
            "CJ", "CQ", "CK", //クラブの1から13のカード
            "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10",
            "DJ", "DQ", "DK", //ダイヤの1から13のカード
            "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", 
            "HJ", "HQ", "HK" //ハートの1から13のカード         
        };
        
        String[] mycard=new String[5]; //配られた5枚カード
        int deal_num=0;
        
        System.out.println("ポーカー"); //タイトル
        
        // シャッフルする
        for(int i=0;i<52;i++){           // 全部のカードについて
          int r = rand.nextInt(51);         // ランダムに別のカードを1枚選び
          String t=card[r];              // それと
          card[r]=card[i];               // 自分を
          card[i]=t;                     // 交換する
        }

        // カードを配る
        for(int i=0;i<5;i++){            // 5枚分繰り返す
          mycard[i]=card[deal_num++];    // cardの先頭からmycardに配っていく
        }

        // 交換
        System.out.println("カードが配られました。");
        System.out.println("交換できる回数は2回です。");
            for(int i=0;i<2;i++){                   // 2回繰り返す
        System.out.println((i+1)+"回目：");   // 回数を表示する

        System.out.print("  現在のカード：");
        for(int j=0;j<5;j++)                  // 手のカードを表示する
            System.out.print("["+mycard[j]+"] ");
            System.out.println();
          
        System.out.println("  何枚交換しますか？(0～5)");
        int n = stdIn.nextInt();          // 交換枚数を入力する
        if(n == 0 || n >= 6) break;        // 0枚または6枚以上ならループを抜ける
            for(int j=0;j<n;j++){             // 交換枚数の回数だけ繰り返す
            System.out.println("    "+(j+1)+"番目は？");
                int m = stdIn.nextInt(); // j番の交換するカードの番号を得る
                mycard[m-1]=card[deal_num++];  // その番号のカードを新たに配る
            }
        }

        // 結果表示
        System.out.println();
        System.out.println("---<あなたの手>---");
        for(int i=0;i<5;i++)
            System.out.print("["+mycard[i]+"] ");
        System.out.println();
        System.out. println();

        // 役の判定
        String yaku="スカ";
        
        //ワンペアの判定
        int one_pair = 0; //ワンペアの数を0に初期化
        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5; j++){
                String n1 = mycard[i].substring(1); //カードiの数字部分
                String n2 = mycard[j].substring(1); //カードjの数字部分
                if(n1.equals(n2)) //2つの数字部分が同じなら
                    one_pair++; //ワンペアの数を1増やす
            }
        }
        
        //スリーカード
        int three_card = 0;
        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5; j++){
                for(int k = j+1; k < 5; k++){
                String n1 = mycard[i].substring(1); //カードiの数字部分
                String n2 = mycard[j].substring(1); //カードjの数字部分
                String n3 = mycard[k].substring(1); //カードkの数字部分
                if(n1.equals(n2) && n1.equals(n3)) //3つの数字部分が同じなら
                three_card++; //ワンペアの数を1増やす
                }
            }
        }
        
        //ツーペア
        int two_pair = 0;
        for(int i = 0; i < 5; i++){
            for(int j = i+1; j < 5; j++){
                for(int k = j+1; k < 5; k++){
                    for(int l = k+1; l < 5; l++){                
                    String n1 = mycard[i].substring(1); //カードiの数字部分
                    String n2 = mycard[j].substring(1); //カードjの数字部分 
                    String n3 = mycard[k].substring(1); //カードkの数字部分
                    String n4 = mycard[l].substring(1); //カードkの数字部分
                    if(n1.equals(n2) && n3.equals(n4)) //3つの数字部分が同じなら
                    two_pair++; //ワンペアの数を1増やす
                    }
                }
            }
        }   
        
        if(one_pair == 1) yaku = "ワンペア";
        if(three_card == 1) yaku = "スリーカード";
        if(two_pair == 1) yaku = "ツーペア";
        // 役の表示
        System.out.println("あなたの役は･･･「"+yaku+"」です");
        System.out.println();

        
    }
}
