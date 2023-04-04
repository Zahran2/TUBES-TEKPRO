package tes;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi aplikasi pemesanan lapangan
        AplikasiPemesanan aplikasi = new AplikasiPemesanan();

        // Tampilkan daftar lapangan
        aplikasi.tampilkanDaftarLapangan();

        // Pesan lapangan
        aplikasi.pesanLapangan("Yabul", "081234567890", 0, "2022-04-01", "15:00", 2);

        // Tampilkan daftar pemesanan pada tanggal tertentu
        aplikasi.tampilkanDaftarPemesanan("2022-04-01");
    }
}