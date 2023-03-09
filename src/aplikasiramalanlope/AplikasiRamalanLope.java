/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasiramalanlope;

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;
import java.util.Random;

public class AplikasiRamalanLope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        String nama1, nama2;
        int umur1, umur2;
        int low = 50;
        int high = 100;

        int x = r.nextInt(high - low) + low;

        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("");

        System.out.println("Data Anda: ");
        System.out.println("***********");
        System.out.print("Masukan Nama Anda : ");
        nama1 = in.next();
        System.out.print("Masukan Umur Anda : ");
        umur1 = in.nextInt();
        System.out.println("");

        System.out.println("Data Pasangan Anda: ");
        System.out.println("********************");
        System.out.print("Masukan Nama Pasangan Anda : ");
        nama2 = in.next();
        System.out.print("Masukan Umur Pasangan Anda : ");
        umur2 = in.nextInt();
        System.out.println("");

        System.out.println(nama1 + " [" + umur1 + "] " + "tahun");

        for (int i = 1; i <= 2; i++) {
            for (int k = 1; k <= 2 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (2 - i + 1) - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (5 - i + 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(nama2 + " [" + umur2 + "] " + "tahun");

        System.out.println("");

        System.out.print("Tekan ENTER untuk melihat hasil ramalan.....");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();

        System.out.println("");

        System.out.println("Kecocokan anda dengan pasangan anda adalah: " + x + "%");

        System.out.println("");

        System.out.println("Terima Kasih karena Anda telah menggunakan jasa ramalan kami ^.^");
    }
    
}
