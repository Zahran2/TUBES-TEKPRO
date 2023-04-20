package tes;

import java.util.ArrayList;
import java.util.HashMap;

public class AplikasiPemesanan {
    private ArrayList<Lapangan> daftarLapangan;
    private HashMap<String, ArrayList<Pemesanan>> daftarPemesanan;

    public AplikasiPemesanan() {
        daftarLapangan = new ArrayList<>();
        daftarPemesanan = new HashMap<>();

        // Menambahkan beberapa lapangan ke dalam daftar lapangan
        daftarLapangan.add(new Lapangan("Lapangan A", "Futsal", 100000));
        daftarLapangan.add(new Lapangan("Lapangan B", "Basket", 80000));
        daftarLapangan.add(new Lapangan("Lapangan C", "Badminton", 50000));
    }

    // Buat method untuk menampilkan daftar lapangan
    public void tampilkanDaftarLapangan() {
        System.out.println("Daftar lapangan:");
        for (Lapangan lapangan : daftarLapangan) {
            System.out.println("- " + lapangan.getNama() + " (" + lapangan.getJenis() + ") - Harga sewa per jam: Rp "
                    + lapangan.getHargaSewaPerJam());
        }
    }

    // Buat method untuk melakukan pemesanan lapangan
    public void pesanLapangan(String nama, String nomorHp, int indeksLapangan, String tanggalSewa, String jamMulai,
            int durasiSewa) {
        Lapangan lapangan = daftarLapangan.get(indeksLapangan);
        double totalBiaya = lapangan.getHargaSewaPerJam() * durasiSewa;

        Pemesanan pemesanan = new Pemesanan(nama, nomorHp, lapangan, tanggalSewa, jamMulai, durasiSewa, totalBiaya);

        if (daftarPemesanan.containsKey(tanggalSewa)) {
            ArrayList<Pemesanan> pemesananTertentu = daftarPemesanan.get(tanggalSewa);
            pemesananTertentu.add(pemesanan);
            daftarPemesanan.put(tanggalSewa, pemesananTertentu);
        } else {
            ArrayList<Pemesanan> pemesananTertentu = new ArrayList<>();
            pemesananTertentu.add(pemesanan);
            daftarPemesanan.put(tanggalSewa, pemesananTertentu);
        }

        System.out.println("Pemesanan berhasil dilakukan! Detail pemesanan:");
        System.out.println("Nama: " + nama);
        System.out.println("Nomor HP: " + nomorHp);
        System.out.println("Lapangan: " + lapangan.getNama() + " (" + lapangan.getJenis() + ")");
        System.out.println("Tanggal sewa: " + tanggalSewa);
        System.out.println("Jam mulai: " + jamMulai);
        System.out.println("Durasi sewa: " + durasiSewa + " jam");
        System.out.println("Total biaya: Rp " + totalBiaya);
    }

    // Buat method untuk menampilkan daftar pemesanan pada tanggal tertentu
    public void tampilkanDaftarPemesanan(String tanggalSewa) {
        if (daftarPemesanan.containsKey(tanggalSewa)) {
            System.out.println("Daftar pemesanan pada tanggal " + tanggalSewa + ":");
            ArrayList<Pemesanan> pemesananTertentu = daftarPemesanan.get(tanggalSewa);
            for (Pemesanan pemesanan : pemesananTertentu) {
                System.out.println("- " + pemesanan.getNama() + " (" + pemesanan.getNomorHp() + ") - "
                        + pemesanan.getLapangan().getNama() + " (" + pemesanan.getLapangan().getJenis() + ") - "
                        + pemesanan.getJamMulai() + " (" + pemesanan.getDurasiSewa() + " jam) - Rp "
                        + pemesanan.getTotalBiaya());
            }
        } else {
            System.out.println("Tidak ada pemesanan pada tanggal " + tanggalSewa);
        }
    }
}