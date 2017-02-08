/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porkergame;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Stack;

/**
 *カードの山
 * @author c16310
 */
public class Deck extends Stack<Card>{
    
    Deck(){
        
    }
    
    //シャッフル
    void Shuffle(){
        Collections.shuffle(this);
    }
    /*カードの追加
    //カートを1枚引く
    //もし枚数以上のカードの位置の場合最後のカードを返す
    public Card withdraw(int num){
        if(num>size()) num = size();
        return remove(num);
    } */
}
