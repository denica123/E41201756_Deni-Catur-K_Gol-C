
package control.statement;

/**
 *
 * @author denic
 */
public class Tugas_2 {
    
    public static void main(String[] args){
        
        System.out.println("           Do__While          ");
        System.out.println(" Bilangan perkalian 2 (0 - 100)");
        System.out.println("=================================");
        
        int i = 1;
        
        do {
            System.out.print( "  "+ i +  " ");
            i*= 2;
        } while ( i <= 100);     
        
       
        System.out.println("  ");
        System.out.println(" Bilangan kelipatan 2 (0 - 100) ");      
        System.out.println("=================================");
        int x = 0;
        
        do {
            System.out.print( "  "+ x +  " ");
            x+= 2;
        } while ( x <= 100);
        
        
    }
    
}
