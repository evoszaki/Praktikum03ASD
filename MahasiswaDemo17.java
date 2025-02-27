import java.util.Scanner;
public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        Mahasiswa17[] arrayofMahasiswa17 = new Mahasiswa17[3];
        String dummy;
        for(int i = 0; i < 3; i++) {
            arrayofMahasiswa17 [i] = new Mahasiswa17();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("Kode   : ");
            arrayofMahasiswa17[i].nim = input17.nextLine();
            System.out.print("Nama   : ");
            arrayofMahasiswa17[i].nama = input17.nextLine();
            System.out.print("Kelas  : ");
            arrayofMahasiswa17[i].kelas = input17.nextLine();
            System.out.print("IPK    : ");
            dummy = input17.nextLine();
            arrayofMahasiswa17[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------------------");
        }
        
       for(int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": ");
            arrayofMahasiswa17[i].cetakInfo();
       }
    }
}
