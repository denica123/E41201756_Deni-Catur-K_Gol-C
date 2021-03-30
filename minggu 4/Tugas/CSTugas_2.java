package control.statement;

/**
 *
 * @author denic
 */
public class CSTugas_2 {
    public static void main(String[] args){
        
        System.out.println("           Do__While          ");
        System.out.println(" Bilangan kelipatan 2 (1 - 100)");
        System.out.println("=================================");
        
        int i = 2;
        
        do {
            System.out.print( " "+ i + " ");
            i*= 2;
        } while ( i <= 100);
    }
}
