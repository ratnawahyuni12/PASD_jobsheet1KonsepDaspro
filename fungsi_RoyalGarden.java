public class fungsi_RoyalGarden {

    // fungsi hitung pendapatan tiap cabang
    static int hitungPendapatan(int[] stockBunga, int[] hargaBunga) {
        int totalPendapatan = 0;

        for (int i = 0; i < stockBunga.length; i++) {
            totalPendapatan += stockBunga[i] * hargaBunga[i];
        }

        return totalPendapatan;
    }

    // fungsi tentukan status cabang toko
    static String tentukanStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    // fungsi tampilkan hasil
    static void tampilkanHasil(String[] namaCabang, int[][] stockBunga, int[] hargaBunga) {
        System.out.println("==========================================================");
        System.out.println("          ==- Laporan Pendapatan Royal Garden -==         ");
        System.out.println("=========================================================="); 
        System.out.printf("%-20s %-21s %-20s\n", "Cabang", "Pendapatan", "Status Cabang");
        System.out.println("=========================================================="); 

        for (int i = 0; i < namaCabang.length; i++) {
            int pendapatan = hitungPendapatan(stockBunga[i], hargaBunga);
            String status = tentukanStatus(pendapatan);

            System.out.printf("%-20s Rp %-18s %-20s\n", namaCabang[i], String.format("%,d", pendapatan), status);
        }

        System.out.println("=========================================================="); 
    }

    public static void main(String[] args) {
        // nama cabang
        String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

        // stock bunga
        int[][] stockBunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};

        // harga bunga
        int[] hargaBunga = {75000, 50000, 60000, 10000};

        // tampilkan hasil
        tampilkanHasil(namaCabang, stockBunga, hargaBunga);
    }
}