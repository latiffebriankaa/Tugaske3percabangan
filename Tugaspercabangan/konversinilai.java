package Tugaspercabangan;

import java.util.Scanner;

public class konversinilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // user memasukan nilai
        System.out.print("Masukkan nilai anda : ");
        double nilai = input.nextDouble();
        
        // Memanggil metode konversi nilai
        String hasilnilai = konversiNilai(nilai);
        System.out.println("Nilai anda : " + hasilnilai);
    }

    public static String konversiNilai(double nilai) {
        
        // percabangan
        if (nilai > 100) {
            return "inputan salah :( ";
        } else if (nilai > 85) {
            return "A";
        } else if (nilai > 75) {
            return "B";
        } else if (nilai > 65) {
            return "C";
        } else if (nilai > 55) {
            return "D";
        } else {
            return "E";
        }
    }
}
