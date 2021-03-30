/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.statement;

import java.util.Scanner;

/**
 *
 * @author denic
 */
public class CSTugas_1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal bilangan :");
        int a = input.nextInt();
        
        System.out.print("Masukkan batas akhir bilangan :");
        int b = input.nextInt();
        
        for (int gnp = a; gnp <= b; gnp++){
            if (gnp % 2 == 0){
                System.out.print(gnp + " ");
            }else;
        }
    }
}

