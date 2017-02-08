package porkergame;

import java.util.List;

public class PokerRule {
     
    public int judgeCard(List<Card> Hand){
        int result = 0;
        //int result = 0;
        int count = 0;
        //int Comcount = 0;
        // 役の判定       

        for(int i = 0; i < 4; i++){
            int tmp = Hand.get(i).getNumber();
            for (int j = i+1; j < 5; j++){
                if(j==i) continue;
                if(Hand.get(j).getNumber() == tmp){                    
                    count++;
                    //l++;
                    break;
                }
            }
        }        
            if(count == 1)
                return result = 1; //ワンペア
            else if(count == 2)
                 return result = 2; //ツーペア
            else if (count == 0)
                return result = 0;            
        
        for(int i = 0; i < 4; i++){
            int tmp = Hand.get(i).getNumber();
            for (int j = i+1; j < 5; j++){
                if(j==i) continue;
                for (int k = i+2; k < 6; k++){
                    if(Hand.get(k).getNumber() == tmp){
                        count++; 
                    }
                }
            }
        }
        if(count == 3)
                return result = 3; //スリーカード
        else if(count == 4)
                return result = 4; //4カード
        //isWin (judgeCard,judgeCard){
            
        //}   
         return 0;   
    }
}
 