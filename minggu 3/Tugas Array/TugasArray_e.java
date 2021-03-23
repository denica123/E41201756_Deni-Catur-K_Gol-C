
package tugasarray;

import java.util.Scanner;

/**
 *
 * @author denic
 */
public class TugasArray_e {
    public static void main (String[] args){
        
        System.out.println("    CAFE CERIA      ");
        System.out.println("  ANEKA MINUMAN ");
        System.out.println("-----------------------------");
        
        System.out.println("  SPECIAL MENU  : "); 
        System.out.println("1.  Soft drinks");
        System.out.println("2.  Mix juice");
        System.out.println("3.  Nescafe");
        System.out.println("4.  Soda milk");
        System.out.println("5.  Tea");
        
        System.out.println("-----------------------------");
        
        String pilihan;
        String pembeli;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nama pembeli : ");
        pembeli = scan.nextLine();
        
        System.out.print("Silahkan Masukkan pilihan anda : ");
        pilihan = scan.nextLine();
        
        switch (pilihan){
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                System.out.println("pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjunng diCafe Ceria");
            break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                System.out.println("pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjunng diCafe Ceria");
            break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                System.out.println("pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjunng diCafe Ceria");
            break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                System.out.println("pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjunng diCafe Ceria");
            break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("pesanan akan segera kami antar");
                System.out.println("Terima kasih " + pembeli + " telah berkunjunng diCafe Ceria");
            break;
        }
    }
}
