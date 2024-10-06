package Tugaspercabangan;

import java.util.Scanner;

public class hargajeruk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // user memasukan jumlah jeruk yang ingin di beli
        System.out.print("jumlah jeruk yang ingin dibeli : ");
        int jumlahJeruk = input.nextInt();
        
        // metode untuk menghitung harga
        int totalHarga = hitungHarga(jumlahJeruk);
        
        // output
        System.out.printf("Beli %d = %d Rupiah%n", jumlahJeruk, totalHarga);
    }

    public static int hitungHarga(int jumlahJeruk) {
        int harga = 0;

        // modulus
        if (jumlahJeruk >= 5) {
            int paket5 = jumlahJeruk / 5;
            harga += paket5 * 10000; 
            jumlahJeruk %= 5; 
        }
        
        // percabangan
        if (jumlahJeruk == 2) {
            harga += 5000; // 2 jeruk
        } else if (jumlahJeruk == 1) {
            harga += 3000; // 1 jeruk
        } else if (jumlahJeruk == 3) {
            harga += 3000 * 3; // 3 jeruk
        } else if (jumlahJeruk == 4) {
            harga += 5000 + 3000; // 4 jeruk (1x5.000 + 1x3.000)
        }
        return harga;
    }
}
