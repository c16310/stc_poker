/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porkergame;

/**
 *
 * @author c16310
 */
public enum CardSuit {
    Diamond(0), Spade(1), Clover(2), Heart(3);
    
    private final int id;
    
    private CardSuit(final int id){
        this.id = id;
    }
}
