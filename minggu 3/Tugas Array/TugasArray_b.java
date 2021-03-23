
package tugasarray;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author denic
 */
public class TugasArray_b {
    public static void main (String[] args){
        System.out.print("Masukkan jumlah deret bilangan  : ");
        int deretbil = new Scanner(System.in).nextInt();
 
        Random array = new Random();
        int hasil;
        
        for ( int i = 0; i< deretbil ; i++ ){
            hasil = array.nextInt(10) + 1;
            System.out.print(" " + hasil);
        }  
    }
}
        
    
