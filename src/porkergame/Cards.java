/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porkergame;
import java.util.ArrayList;
import java.util.List;
/**
 *Cards
 * @author c16310
 */
public class Cards{
    final static Deck deck = new Deck();
    
    static {
        for(int i=0; i<4; i++){
            for(int j = 1; j<=13; j++){
                deck.add(new Card(i,j));
            }
        }
    }
    
    static Deck newCards(){
        return deck;
    }
    /*public enum Suit{
        Diamond(0),Clover(1),Spade(2),Heart(3);
        private int id;
        
        private Suit(int id){this.id = id;}
    }
    public enum Rank{
        A(1),Two(2),Three(3),Four(4),Five(5),Six(6),Seven(7),Eight(8), Nien(9), Ten(10),
        J(11),Q(12),K(13);
        private int id;
        
        private Rank(int id){this.id = id;}
    }

    static final List<Cards> deck = new ArrayList<>();

    private final Suit suit;
    private final Rank rank;

    Cards(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    static{
        for(Suit suit: Suit.values()){
            for(Rank rank: Rank.values()){
                    deck.add(new Cards(suit ,rank));
            }
        }

    }

    public static ArrayList<Cards> newDeck(){
        return new ArrayList<Cards>(deck);
    } */
}
