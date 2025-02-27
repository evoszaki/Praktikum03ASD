public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Mahasiswa17[] arrayofMahasiswa17 = new Mahasiswa17[3];
        arrayofMahasiswa17[0] = new Mahasiswa17();
        arrayofMahasiswa17[0].nim = "244107060033";
        arrayofMahasiswa17[0].nama = "AGNES TIRTA KINANTI";
        arrayofMahasiswa17[0].kelas = "SIB-1E";
        arrayofMahasiswa17[0].ipk = (float) 3.75;
        
        arrayofMahasiswa17[1] = new Mahasiswa17();
        arrayofMahasiswa17[1].nim = "2341720172";
        arrayofMahasiswa17[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa17[1].kelas = "TI-2A";
        arrayofMahasiswa17[1].ipk = (float) 3.36;

        arrayofMahasiswa17[2] = new Mahasiswa17();
        arrayofMahasiswa17[2].nim = "244107023006";
        arrayofMahasiswa17[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayofMahasiswa17[2].kelas = "TI-2E";
        arrayofMahasiswa17[2].ipk = (float) 3.80;

        System.out.println("Nim    : " + arrayofMahasiswa17[0].nim);
        System.out.println("Nama   : " + arrayofMahasiswa17[0].nama);
        System.out.println("Kelas  : " + arrayofMahasiswa17[0].kelas);
        System.out.println("IPK    : " + arrayofMahasiswa17[0].ipk);
        System.out.println("----------------------------------------");
        System.out.println("Nim    : " + arrayofMahasiswa17[1].nim);
        System.out.println("Nama   : " + arrayofMahasiswa17[1].nama);
        System.out.println("Kelas  : " + arrayofMahasiswa17[1].kelas);
        System.out.println("IPK    : " + arrayofMahasiswa17[1].ipk);
        System.out.println("----------------------------------------");
        System.out.println("Nim    : " + arrayofMahasiswa17[2].nim);
        System.out.println("Nama   : " + arrayofMahasiswa17[2].nama);
        System.out.println("Kelas  : " + arrayofMahasiswa17[2].kelas);
        System.out.println("IPK    : " + arrayofMahasiswa17[2].ipk);
        System.out.println("----------------------------------------");
    }
}
