import java.util.Scanner;

public class DataDosen17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        Dosen17[] arrayOfDosen17 = new Dosen17[3];

        for (int i = 0; i < arrayOfDosen17.length; i++) {
            System.out.println("\nInput data dosen ke-" + (i + 1));
            arrayOfDosen17[i] = new Dosen17("", "", true, 0);
            arrayOfDosen17[i].tambahData(input17);
        }

        System.out.println("\n===== Data Dosen =====");
        for (Dosen17 dosen : arrayOfDosen17) {
            dosen.tampilkanData();
        }

        input17.close();
    }
}
