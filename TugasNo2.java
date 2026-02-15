import java.util.Scanner;

public class TugasNo2 {

    // Fungsi untuk input jadwal
    public static void inputJadwal(String[][] jadwal, Scanner input) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();
 
            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // Fungsi untuk menampilkan semua jadwal dalam tabel
    public static void tampilkanJadwal(String[][] jadwal) {
        System.out.println("\n===== JADWAL KULIAH =====");
        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    // Fungsi cari jadwal berdasarkan hari
    public static void cariBerdasarkanHari(String[][] jadwal, Scanner input) {
        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String hariCari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {
                if (!ditemukan) {
                    System.out.println("\nJadwal pada hari " + hariCari + ":");
                    System.out.printf("%-25s %-20s %-10s %-15s\n",
                            "Mata Kuliah", "Ruang", "Hari", "Jam");
                }

                System.out.printf("%-25s %-20s %-10s %-15s\n",
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][2],
                        jadwal[i][3]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    // Fungsi cari jadwal berdasarkan mata kuliah
    public static void cariBerdasarkanMatkul(String[][] jadwal, Scanner input) {
        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String matkulCari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkulCari)) {

                if (!ditemukan) {
                    System.out.println("\nJadwal Mata Kuliah " + matkulCari + ":");
                    System.out.printf("%-25s %-20s %-10s %-15s\n",
                            "Mata Kuliah", "Ruang", "Hari", "Jam");
                }

                System.out.printf("%-25s %-20s %-10s %-15s\n",
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][2],
                        jadwal[i][3]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(input.nextLine());

        String[][] jadwal = new String[n][4];

        // Input jadwal
        inputJadwal(jadwal, input);

        // Tampilkan semua
        tampilkanJadwal(jadwal);

        // Cari berdasarkan hari
        cariBerdasarkanHari(jadwal, input);

        // Cari berdasarkan mata kuliah
        cariBerdasarkanMatkul(jadwal, input);

        input.close();
    }
}
