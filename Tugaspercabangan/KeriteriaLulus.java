package Tugaspercabangan;

import java.util.Scanner;

public class KeriteriaLulus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //user memasukan nilai
        System.out.print("Masukkan nilai anda: ");
        double nilai = input.nextDouble();
        
        //prcabangan
        if (nilai > 100 ) {
            System.out.println("Status: inputan salah :(");
        }else if (nilai > 75 ) {
            System.out.println("Status: selamat anda lulus :D ");
        }else {
            System.out.println("Status: Tidak Lulus :(");
        }
        input.close();
    }
}


