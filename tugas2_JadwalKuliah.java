import java.util.Scanner;
public class tugas2_JadwalKuliah {
    static Scanner sc = new Scanner(System.in);

    // fungsi 1: input data jadwal kuliah
    static void inputJadwal(String[][] jadwal, int jumlah) {
        for (int i =  0; i < jumlah; i++) {
            System.out.println("\n==- Input Jadwal Ke-" + (i+1) + " -==");
            sc.nextLine();

            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = sc.nextLine();
        }
        System.out.println("Data Jadwal Berhasil Diinput!");
    }

    // fungsi 2: tampilkan semua jadwal dalam bentuk tabel
    static void tampilkanSemuaJadwal(String[][] jadwal, int jumlah) {
        if (jumlah == 0) {
            System.out.println("Belum ada jadwal yang diinput");
            return;
        }

        System.out.println("=============================================================================================");
        System.out.println("                                   ===- Jadwal Kuliah -===                                   ");
        System.out.println("=============================================================================================");
        System.out.printf("%-5s %-30s %-20s %-15s %-15s\n", "Nomor", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("=============================================================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-30s %-20s %-15s %-15s\n", (i+1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("=============================================================================================");
    }

    //fungsi 3: mencari jadwal sesuai hari tertentu
    static void cariJadwalSesuaiHari(String[][] jadwal, int jumlah) {
        if (jumlah == 0) {
            System.out.println("Belum ada jadwal yang diinput");
            return;
        }
        sc.nextLine();

        System.out.print("\nMasukkan hari yang dicari: ");
        String hari = sc.nextLine();

        boolean ketemu = false;

        System.out.println("\n=============================================================================================");
        System.out.println("                       ===- Jadwal Kuliah Berdasarkan Hari " + hari.toUpperCase() + " -===                       ");
        System.out.println("=============================================================================================");
        System.out.printf("%-5s %-30s %-20s %-15s %-15s\n", "Nomor", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("=============================================================================================");

        int nomor = 1;
        for (int i = 0; i < jumlah; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-5d %-30s %-20s %-15s %-15s\n", nomor++, jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
        }
        System.out.println("=============================================================================================");
    }

    // fungsi 4: mencari jadwal berdasarkan nama mata kuliah
    static void cariJadwalSesuaiNamaMatkul(String[][] jadwal, int jumlah) {
        if (jumlah == 0) {
            System.out.println("Belum ada jadwal yang diinput!");
            return;
        }

        sc.nextLine();

        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String mataKuliah = sc.nextLine();

        boolean ketemu = false;

        System.out.println("\n=============================================================================================");
        System.out.println("                       ===- Jadwal Kuliah Berdasarkan Mata Kuliah " + mataKuliah.toUpperCase() + " -===                       ");
        System.out.println("=============================================================================================");
        System.out.printf("%-5s %-30s %-20s %-15s %-15s\n", "Nomor", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("=============================================================================================");

        int nomor = 1;
        for (int i = 0; i < jumlah; i++) {
            if (jadwal[i][0]. toLowerCase().contains(mataKuliah.toLowerCase())) {
                System.out.printf("%-5d %-30s %-20s %-15s %-15s\n", nomor++, jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Tidak ditemukan mata kuliah dengan nama: " + mataKuliah);
        }
        System.out.println("=============================================================================================");
    }

    public static void main(String[] args) {
        System.out.println("=============================================================================================");
        System.out.println("                               PROGRAM MANAJEMEN JADWAL KULIAH                               ");
        System.out.println("=============================================================================================");
        
        System.out.print("\nMasukkan jumlah jadwal kuliah: ");
        int jumlahJadwal = sc.nextInt();
        
        // Deklarasi array 2D untuk menyimpan jadwal
        // [jumlah jadwal][4 kolom: Nama MK, Ruang, Hari, Jam]
        String[][] jadwal = new String[jumlahJadwal][4];
        
        // Input jadwal
        inputJadwal(jadwal, jumlahJadwal);
        
        // Menu
        String pilihan;
        do {
            System.out.println("\n=============================================================================================");
            System.out.println("                                            MENU                                             ");
            System.out.println("=============================================================================================");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.println("=============================================================================================");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.next();
            
            switch (pilihan) {
                case "1":
                    tampilkanSemuaJadwal(jadwal, jumlahJadwal);
                    break;
                case "2":
                    cariJadwalSesuaiHari(jadwal, jumlahJadwal);
                    break;
                case "3":
                    cariJadwalSesuaiNamaMatkul(jadwal, jumlahJadwal);
                    break;
                case "4":
                    System.out.println("\nTerima kasih telah menggunakan program!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
            
        } while (!pilihan.equals("4"));
        
        sc.close();
    }
}
