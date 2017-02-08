/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porkergame;
import java.util.ArrayList;
import java.util.List;
/**
 *Player
 * @author c16310
 */
public class Player {
    private String name;
    private int coins = 0;
    private List<Card> hand;
    
    public Player(String name, int coins){
        this.name = name;
        this.coins = coins;
        hand = new ArrayList<Card>();
    }
    
    public void steCoins(int num){
        this.coins = num;
    }
    //コインをかける
    public void bet(int num){
        coins -= num;
    }
    //カードを捨てる
    Card drawOut(int index){
       return hand.remove(index);
    }
    //カードを引く
    void drawIn(Card c){
        hand.add(c);
    }

    //カードを表示
    void displayHand(){
        System.out.println(hand);
    }
  
    List getHand(){         //取得のためのメソッド リストで返す
        return hand;
    }
}
