import java.util.Scanner;
public class MatakuliahDemo17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        Matakuliah17[] arrayofMatakuliah17 = new Matakuliah17[3];
        String kode, nama, dummy;
        int sks, jumlahjam;
        
        for(int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = input17.nextLine();
            System.out.print("Nama          : ");
            nama = input17.nextLine();
            System.out.print("SKS           : ");
            dummy = input17.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = input17.nextLine();
            jumlahjam = Integer.parseInt(dummy);
            System.out.println("----------------------------------------");

            arrayofMatakuliah17[i] = new Matakuliah17(kode, nama, sks, jumlahjam);
        }
        for(int i = 0 ; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1) + ": ");
            System.out.println("Kode          : " + arrayofMatakuliah17[i].kode);
            System.out.println("Nama          : " + arrayofMatakuliah17[i].nama);
            System.out.println("SKS           : " + arrayofMatakuliah17[i].sks);
            System.out.println("Jumlah Jam    : " + arrayofMatakuliah17[i].jumlahjam);
            System.out.println("----------------------------------------");
        }
    }
}