package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi aplikasi pemesanan lapangan
        AplikasiPemesanan aplikasi = new AplikasiPemesanan();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("=== GOR TRITOL ===");
            System.out.println("1. Daftar Lapangan");
            System.out.println("2. Book Lapangan");
            System.out.println("3. Daftar Harga");
            System.out.println("4. Contact Person");
            System.out.println("0. Exit");

            System.out.println("Silahkan masukkan input: ");
            int i = sc.nextInt();
            sc.nextLine();

            switch (i) {
                case 1:
                    aplikasi.tampilkanDaftarLapangan();
                    System.out.println("Klik enter untuk kembali");
                    Scanner c = new Scanner(System.in);
                    c.nextLine();
                    break;
                case 2:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Masukkan nama Anda: ");
                    String nama = sc.nextLine();
                    System.out.println("Masukkan nomor HP Anda: ");
                    String noHP = sc.nextLine();
                    System.out.println("Masukkan nama lapangan yang ingin dipesan: ");
                    System.out.println("1. Futsal");
                    System.out.println("2. Basket");
                    System.out.println("3. Badminton");
                    int namaLapang = sc.nextInt();
                    sc.nextLine();
                    namaLapang -= 1;
                    System.out.print("Masukkan tanggal sewa (yyyy-mm-dd): ");
                    String tanggalSewa = sc.nextLine();
                    System.out.print("Masukkan jam mulai (hh:mm): ");
                    String jamMulai = sc.nextLine();
                    System.out.print("Masukkan durasi sewa (jam): ");
                    int durasiSewa = sc.nextInt();
                    sc.nextLine();
                    aplikasi.pesanLapangan(nama, noHP, namaLapang, tanggalSewa, jamMulai, durasiSewa);
                    aplikasi.tampilkanDaftarPemesanan(tanggalSewa);
                    System.out.println("Klik enter untuk kembali");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("=== DAFTAR HARGA LAPANGAN ===\n\n");
                    System.out.println("PAGI  (06.00 - 11.00)");
                    System.out.println("SIANG (11.00 - 15.00)");
                    System.out.println("SORE  (15.00 - 18.00)");
                    System.out.println("MALAM (19.00 - 21.00)\n\n");
                    System.out.println("PAGI  : 100.000 / JAM");
                    System.out.println("SIANG : 120.000 / JAM");
                    System.out.println("SORE  : 130.000 / JAM");
                    System.out.println("MALAM : 150.000 / JAM\n");
                    System.out.println("HARGA WEEKDAY DAN WEEKEND SAMA !\n");

                    System.out.println("Klik enter untuk kembali");
                    Scanner s = new Scanner(System.in);
                    s.nextLine();
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("     === CONTACT PERSON MANAGER ===");
                    System.out.println("1. Yayan Ruhiyan        - 082111442719");
                    System.out.println("2. Zahran Elementalist  - 085720318361");
                    System.out.println("3. Bob Tutupbotol       - 081314366447");
                    sc.nextLine();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input yang dimasukkan salah!");
                    break;
            }
        }

        // Tampilkan daftar lapangan
        // aplikasi.tampilkanDaftarLapangan();

        // // Pesan lapangan
        // aplikasi.pesanLapangan("Yabul", "081234567890", 0, "2022-04-01", "15:00", 2);

        // // Tampilkan daftar pemesanan pada tanggal tertentu
        // aplikasi.tampilkanDaftarPemesanan("2022-04-01");
    }
}