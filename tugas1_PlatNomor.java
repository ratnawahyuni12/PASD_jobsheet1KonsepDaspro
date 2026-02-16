import java.util.Scanner;

public class tugas1_PlatNomor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array 1
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        // array 2
        char[][] KOTA = new char[10][12];
        // data kota
        char[][] dataKOTA = {
            {'B', 'A', 'N', 'T', 'E','N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'},
        };

        // copy ke KOTA[10][12]
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < dataKOTA[i].length; j++) {
                KOTA[i][j] = dataKOTA[i][j];
            }
        }

        String lanjut;

        do {
            System.out.println("=====================================");
            System.out.println("  =- Program Pencarian Kode Plat -=  ");
            System.out.println("=====================================");
            System.out.print("Masukkan kode plat: ");
            char input = sc.next().toUpperCase().charAt(0);

            boolean ketemu = false;

            for (int i = 0; i < KODE.length; i++) {
                if (input == KODE[i]) {
                    System.out.print("Nama Kota: ");

                    for (int j = 0; j < KOTA[i].length && KOTA[i][j] != '\0'; j++) {
                        System.out.print(KOTA[i][j]);
                    }

                    System.out.println();
                    ketemu = true;
                    break;
                }
            }

            if (!ketemu) {
                System.out.println("Kota Tidak Ditemukan!");
            }

            System.out.print("\nCari Lagi? (y/n): ");
            lanjut = sc.next();
            System.out.println();

        } while (lanjut.equalsIgnoreCase("y"));
            System.out.println("Terima Kasih!");
            sc.close();
    }
}
