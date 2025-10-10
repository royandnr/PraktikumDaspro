package jobsheet5;
import java.util.Scanner;

public class Tugas3IzinMasukPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Izin Masuk Perpustakaan Kampus ---");
        System.out.print("Apakah membawa kartu mahasiswa? (true/false): ");
        boolean kartuMahasiswa = sc.nextBoolean();

        System.out.print("Apakah sudah registrasi online? (true/false): ");
        boolean registrasiOnline = sc.nextBoolean();

        if (kartuMahasiswa || registrasiOnline) {
            System.out.println("Izin masuk diberikan.");
        } else {
            System.out.println("Izin masuk ditolak.");
        }
    }
}

