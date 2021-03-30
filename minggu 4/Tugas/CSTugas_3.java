package control.statement;

import java.util.Scanner;

/**
 *
 * @author denic
 */
public class CSTugas_3 {
    public static void main(String[] args){
        
        int tampung[], NilMax, NilMin, Rata;
        
        Scanner input = new Scanner(System.in);
        Scanner data = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya data nilai = ");
        int totdata = input.nextInt();
        
        tampung = new int[totdata];
        for (int x = 0; x < totdata; x++ ){
            System.out.printf("Masukan data nilai ke-%d\t: ", x + 1);
            tampung[x] = data.nextInt();
        }
        
        NilMax = tampung[0];
        NilMin = tampung[0];
        for (int b = 0; b < tampung.length; b++){
            if(tampung[b] > NilMax){
                NilMax = tampung[b];
            }
            else if(tampung[b] < NilMin){
                NilMin = tampung[b];
            }
        }
        
        System.out.println("Nilai Minimum = " + NilMin);
        System.out.println("Nilai Maximum = " + NilMax);
        
        int HasilAkhir = 0;
        for(int c = 0; c < tampung.length; c++){
            HasilAkhir = HasilAkhir + tampung[c];
        }
        
        Rata = HasilAkhir / tampung.length;
        System.out.println("Nilai rata - ratanya adalah = " + Rata);
        
    }
    
}
