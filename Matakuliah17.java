import java.util.Scanner;

public class Matakuliah17 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;

    public Matakuliah17(String kode, String nama, int sks, int jumlahjam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    public void tambahData() {
        Scanner input17 = new Scanner(System.in);
        System.out.print("Kode          : ");
        this.kode = input17.nextLine();
        System.out.print("Nama          : ");
        this.nama = input17.nextLine();
        System.out.print("SKS           : ");
        this.sks = Integer.parseInt(input17.nextLine());
        System.out.print("Jumlah Jam    : ");
        this.jumlahjam = Integer.parseInt(input17.nextLine());
        System.out.println("----------------------------------------");
    }
}
