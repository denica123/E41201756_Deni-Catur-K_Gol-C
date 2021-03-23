
package tugasarray;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;


/**
 *
 * @author denic
 */
public class Array_d {
    private static ArrayList<Integer> HargaBarang = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner nama = new Scanner(System.in);
        Scanner harga = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------");
        System.out.println("           Kharisma Agung Plaza < KAP >           ");
        System.out.println("             Promo Belanja Berhadiah              ");
        System.out.println("        Khusus Pembelian 5 Barang Pertama         ");
        System.out.println("        Dengan harga minimum Rp 10000,00          ");
        System.out.println("--------------------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String NMpembeli = nama.next();
        System.out.println("");
        
        for (int x = 0; x < 5; x++) {
            System.out.printf("Masukkan harga barang ke-%d\t: ", x + 1);
            int hrgbarang = harga.nextInt();
            HargaBarang.add(hrgbarang);
        }
        
        int jumlahHarga = HargaBarang.stream().mapToInt(num -> num).sum();
        
        System.out.println("Total harga pembelian atas nama " +NMpembeli+ " adalah Rp " +jumlahHarga);
        
        if (hadiah()) {
            System.out.print("\n\nSelamat...\n");
            System.out.println("Anda mendapat hadiah 1 mug cantik      ");
            System.out.println("----------------------------------------------");
            System.out.println("                   Terima Kasih               ");
            System.out.println("  Anda sudah belanja di Kharisma Agung Plaza  ");
        } else {
            System.out.println("----------------------------------------------");
            System.out.println("                   Terima Kasih               ");
            System.out.println("  Anda sudah belanja di Kharisma Agung Plaza  ");
        }
    }
    static boolean hadiah() {
        boolean hadiahanda = true;

        for (int price : HargaBarang) {
            if (price < 10000) {
                hadiahanda = false;
                break;
            }
        }
        return hadiahanda;
    }
}
    

