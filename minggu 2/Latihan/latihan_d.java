/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;

/**
 *
 * @author denic
 */
public class latihan_d {
    
    public static void main(String[] args){
        
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = s1.nextInt();
        
        int jumlah = nilai1 + nilai2;
        System.out.println("jumlah = " + jumlah);
        
    }
}
