/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card.shuffle;

/**
 *
 * @author cedwa
 */
public class card {
    private final String face;
    private final String suit;
    
    public card(String face, String suit)
    {
        this.face=face;
        this.suit=suit;
    }
    
    
    public String toString()
    {
        
       return face+" of "+suit;
    }
    
}
