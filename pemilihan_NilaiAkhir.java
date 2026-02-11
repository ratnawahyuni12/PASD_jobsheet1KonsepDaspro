import java.util.Scanner;
public class pemilihan_NilaiAkhir {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // input nilai akhir mahasiswa
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("========================");
        
        // nilai tugas 
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = sc.nextDouble();

        // nilai kuis
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = sc.nextDouble();

        // nilai UTS
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = sc.nextDouble();

        // nilaiUAS
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = sc.nextDouble();
        
        System.out.println("========================");
        System.out.println("========================");

        if ((nilaiTugas < 0 || nilaiTugas > 100) || (nilaiKuis < 0 || nilaiKuis > 100) || (nilaiUTS < 0 || nilaiUTS > 100) || (nilaiUAS < 0 || nilaiUAS > 100)) {
            System.out.println("Nilai Tidak Valid!");
            System.out.println("========================");
            System.out.println("========================");
            return;
        }

        // menghitung nilai akhir mahasiswa
        double rataNilaiAkhir = ((0.20 * nilaiTugas) + (0.20 * nilaiKuis) + (0.30 * nilaiUTS) + (0.30 * nilaiUAS));

        // menampilkan nilai akhir dan nilai huruf
        String nilaiHuruf, keterangan;
        if (rataNilaiAkhir > 80 && rataNilaiAkhir <= 100) {
            nilaiHuruf = "A";
            keterangan = "lULUS";
        } else if (rataNilaiAkhir > 73 && rataNilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            keterangan = "lULUS";
        } else if (rataNilaiAkhir > 65 && rataNilaiAkhir <= 73) {
            nilaiHuruf = "B";
            keterangan = "lULUS";
        } else if (rataNilaiAkhir > 60 && rataNilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            keterangan = "lULUS";
        } else if (rataNilaiAkhir > 50 && rataNilaiAkhir <= 60) {
            nilaiHuruf = "C";
            keterangan = "lULUS";
        } else if (rataNilaiAkhir > 39 && rataNilaiAkhir <= 50) {
            nilaiHuruf = "D";
            keterangan = "TIDAK lULUS";
        } else {
            nilaiHuruf = "E";
            keterangan = "TIDAK lULUS";
        }

        System.out.println("Nilai Akhir: " + rataNilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);

        System.out.println("========================");
        System.out.println("========================");
        System.out.println("SELAMAT ANDA " + keterangan);

        sc.close();
    }

}