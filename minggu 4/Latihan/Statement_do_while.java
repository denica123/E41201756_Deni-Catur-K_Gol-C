/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.statement;

/**
 *
 * @author denic
 */
public class Statement_do_while {
    
    public static void main(String[] args){
        //membuat variabel
        int i = 0;
        
        do {
            System.out.println("Perulangan ke-" + i);
            i++;
        } while ( i <= 10);
     
    }
    
}
