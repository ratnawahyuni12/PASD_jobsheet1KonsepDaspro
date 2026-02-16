import java.util.Scanner;
public class array_HitungIPSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        // input jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        System.out.println();
        sc.nextLine();

        // deklarasi array
        String[] namaMataKuliah = new String[jumlahMataKuliah];
        int[] bobotSKS = new int[jumlahMataKuliah];
        double[] nilaiAngka = new double[jumlahMataKuliah];

        // input data setiap mata kuliah
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i+1) + ": ");
            namaMataKuliah[i] = sc.nextLine();

            System.out.print("Masukkan bobot SKS untuk " + namaMataKuliah[i] + ": ");
            bobotSKS[i] = sc.nextInt();

            System.out.print("Masukkan nilai angka untuk " + namaMataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextInt();
            sc.nextLine();

            System.out.println();
        }

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");

        // array untuk hasil konversi
        String[] nilaiHuruf = new String[jumlahMataKuliah];
        double[] nilaiSetara = new double[jumlahMataKuliah];
        String[] kualifikasi = new String[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.00;
                kualifikasi[i] = "Sangat Baik";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.50;
                kualifikasi[i] = "Lebih dari Baik";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.00;
                kualifikasi[i] = "Baik";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.50;
                kualifikasi[i] = "Lebih dari Cukup";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.00;
                kualifikasi[i] = "Cukup";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.00;
                kualifikasi[i] = "Kurang";
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.00;
                kualifikasi[i] = "Gagal";
            }
        }

        // menampilkan hasil konversi
        System.out.println("MK\t\t\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai\tKualifikasi");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.printf("%-55s %-15.2f %-15s %-15.2f %-20s\n", namaMataKuliah[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i], kualifikasi[i]);
        }

        // menghitung IP Semester
        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalNilai += (nilaiSetara[i] * bobotSKS[i]);
            totalSKS += bobotSKS[i];
        }

        double ipSemester = totalNilai / totalSKS;

        System.out.println("======================");
        System.out.printf("IP : %.2f\n", ipSemester);

        sc.close();
    }
}