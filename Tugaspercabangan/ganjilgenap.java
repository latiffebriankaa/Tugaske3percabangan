package Tugaspercabangan;

import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bilangan = input.nextInt();
        
        // percabangan
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah Genap :*.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah Ganjil :*.");
        }
        input.close();
    }
}

