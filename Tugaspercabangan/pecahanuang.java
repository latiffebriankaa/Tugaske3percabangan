package Tugaspercabangan;

import java.util.Scanner;

public class pecahanuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jumlah uang
        System.out.print("Masukkan jumlah uang: ");
        double jumlahUang = input.nextDouble();
        
        // metode untuk menghitung pecahan uang
        hitungPecahan(jumlahUang);
    }

    public static void hitungPecahan(double jumlahUang) {
        
        // percabangan 
        if (jumlahUang >= 100000) {
            double lembar100rb = jumlahUang / 100000;
            System.out.println(lembar100rb + " lembar 100 ribuan");
            jumlahUang %= 100000;
        }
        
        if (jumlahUang >= 50000) {
            double lembar50rb = jumlahUang / 50000;
            System.out.println(lembar50rb + " lembar 50 ribuan");
            jumlahUang %= 50000;
        }
        
        if (jumlahUang >= 20000) {
            double lembar20rb = jumlahUang / 20000;
            System.out.println(lembar20rb + " lembar 20 ribuan");
            jumlahUang %= 20000;
        }
        
        if (jumlahUang >= 10000) {
            double lembar10rb = jumlahUang / 10000;
            System.out.println(lembar10rb + " lembar 10 ribuan");
            jumlahUang %= 10000;
        }
        
        if (jumlahUang >= 5000) {
            double lembar5rb = jumlahUang / 5000;
            System.out.println(lembar5rb + " lembar 5 ribuan");
            jumlahUang %= 5000;
        }
        
        if (jumlahUang >= 2000) {
            double lembar2rb = jumlahUang / 2000;
            System.out.println(lembar2rb + " lembar 2 ribuan");
            jumlahUang %= 2000;
        }
        
        if (jumlahUang >= 1000) {
            double lembar1rb = jumlahUang / 1000;
            System.out.println(lembar1rb + " lembar 1 ribuan");
            jumlahUang %= 1000;
        }
        
        if (jumlahUang >= 500) {
            double lembar500 = jumlahUang / 500;
            System.out.println(lembar500 + " lembar 500");
            jumlahUang %= 500;
        }
        
        if (jumlahUang >= 100) {
            double lembar100 = jumlahUang / 100;
            System.out.println(lembar100 + " lembar 100");
            jumlahUang %= 100;
        }
        
    }
}

