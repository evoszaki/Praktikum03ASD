import java.util.Scanner;
public class MatakuliahDemo17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Matakuliah: ");
        int jumlahMatkul = input17.nextInt();
        Matakuliah17[] arrayofMatakuliah17 = new Matakuliah17[jumlahMatkul];
        
        for(int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayofMatakuliah17[i] = new Matakuliah17("", "", 0, 0);
            arrayofMatakuliah17[i].tambahData();
        }
        for(int i = 0 ; i < jumlahMatkul; i++) {
            System.out.println("Matakuliah ke-" + (i + 1) + ": ");
            arrayofMatakuliah17[i].cetakInfo();
        }
    }
}