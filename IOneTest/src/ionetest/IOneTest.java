/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ionetest;
import mypackage.IOne;

/**
 *
 * @author RIVU
 */
public class IOneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IOne I1=() -> System.out.println("Anonymous class Statement");
            
        I1.f1();
    
    }
        
    
    
}
