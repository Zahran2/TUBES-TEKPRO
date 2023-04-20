package Main;

public class Lapangan {
    private String nama;
    private String jenis;
    private double hargaSewaPerJam;

    public Lapangan(String nama, String jenis, double hargaSewaPerJam) {
        this.nama = nama;
        this.jenis = jenis;
        this.hargaSewaPerJam = hargaSewaPerJam;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHargaSewaPerJam() {
        return hargaSewaPerJam;
    }
}