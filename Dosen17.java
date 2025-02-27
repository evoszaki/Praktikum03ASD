import java.util.Scanner;

public class Dosen17 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen17(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tambahData(Scanner input17) {
        System.out.print("Kode Dosen         : ");
        this.kode = input17.nextLine();
        System.out.print("Nama Dosen         : ");
        this.nama = input17.nextLine();
        System.out.print("Jenis Kelamin (L/W): ");
        String jk = input17.nextLine();
        this.jenisKelamin = jk.equalsIgnoreCase("L");

        while (true) {
            System.out.print("Usia Dosen         : ");
            try {
                this.usia = Integer.parseInt(input17.nextLine());
                if (usia > 0) break;
                System.out.println("Usia harus lebih dari 0!");
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka untuk usia.");
            }
        }
        System.out.println("----------------------------------------");
    }

    public void tampilkanData() {
        System.out.println("Kode Dosen     : " + this.kode);
        System.out.println("Nama Dosen     : " + this.nama);
        System.out.println("Jenis Kelamin  : " + (this.jenisKelamin ? "Laki-laki" : "Wanita"));
        System.out.println("Usia           : " + this.usia);
        System.out.println("----------------------------------------");
    }
}
