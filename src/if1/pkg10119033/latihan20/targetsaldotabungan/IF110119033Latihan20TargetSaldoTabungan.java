/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan20.targetsaldotabungan;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung target saldo tabungan
 */
public class IF110119033Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    
    public static int saldo, target;
    public static double bunga, jumlahBunga;


    
    public static int hitungBunga(double paramJumlahBunga, int paramSaldo, double paramBunga) {
        paramJumlahBunga = paramSaldo * paramBunga;
        paramSaldo += paramJumlahBunga;   
        return paramSaldo;
    }
//    
    public static void main(String[] args) {
        // TODO code application logic here
        saldo = 3500000;
        target = 6000000;
        bunga = 0.08;
        jumlahBunga = 0;
        int i = 1;
        
        do {
            saldo = hitungBunga(jumlahBunga, saldo, bunga);
            System.out.printf("Saldo di bulan ke-" +  i + " Rp. %,d%n", saldo);
            i++;
        } while(saldo < target);
    }
    
}
