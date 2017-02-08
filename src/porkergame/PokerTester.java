
package porkergame;

//import java.util.Collections;
//import java.util.List;
import java.util.Scanner;

/**
 *
 * @author c16310
 */
public class PokerTester {
    static Deck cards; 
    static Table table;
    static PokerRule pokerRule;
    static Player humanPlayer;
    static Player comPlayer;
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        pokerRule = new PokerRule();
        humanPlayer = new HumanPlayer("プレーヤー",100);
        comPlayer = new ComPlayer("Com",100);
        
        while(true){
            cards = Cards.newCards();
            cards.Shuffle();
            dealCards(); //カードを配る
            humanPlayer.displayHand(); //カードを表示
            //comPlayer.displayHand(); //comカードを表示
            System.out.println("何枚捨てる？");
            changeCards();
            humanPlayer.displayHand(); //カードを表示
            comPlayer.displayHand(); //comカードを表示
            System.out.print(pokerRule.judgeCard(humanPlayer.getHand()));
            System.out.println("ペア");
            System.out.print(pokerRule.judgeCard(comPlayer.getHand()));
            System.out.println("ペア");
            System.out.println("continue(Y/n)?"); String yesno = stdIn.next();
            if(yesno.equals("n")) break;
        }
    }
    
    //カードを配る
    static void dealCards(){
        for(int i=0; i<5; i++){
            humanPlayer.drawIn(cards.pop());
            comPlayer.drawIn(cards.pop());            
        }
    }
    
    //カード交換
    static void changeCards(){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        for(int i=0;i<1;i++){
            if(n == 0 || n >= 6) break;        // 0枚または6枚以上ならループを抜ける
            for(int j=0;j<n;j++){             // 交換枚数の回数だけ繰り返す
            System.out.println(""+(j+1)+"番目は？");
            int m = stdIn.nextInt();
            
            //humanPlayer.displayHand(); //カードを表示 
            System.out.println("Draw " + humanPlayer.drawOut(m));
            //humanPlayer.displayHand(); //カードを表示 
            humanPlayer.drawIn(cards.pop());
            //humanPlayer.displayHand(); //カードを表示 
            }
        }
    }    
}
