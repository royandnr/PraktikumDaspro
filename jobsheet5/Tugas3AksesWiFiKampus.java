package jobsheet5;

import java.util.Scanner;

public class Tugas3AksesWiFiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Akses WiFi Kampus ---");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        String jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } 
        else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } 
        else {
            System.out.println("Akses ditolak");
        }

        sc.close();
    }
}


