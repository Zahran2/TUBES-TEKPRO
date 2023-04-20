package Main;

public class Pemesanan {
        private String nama;
        private String nomorHp;
        private Lapangan lapangan;
        private String tanggalSewa;
        private String jamMulai;
        private int durasiSewa;
        private double totalBiaya;
    
        public Pemesanan(String nama, String nomorHp, Lapangan lapangan, String tanggalSewa, String jamMulai, int durasiSewa, double totalBiaya) {
            this.nama = nama;
            this.nomorHp = nomorHp;
            this.lapangan = lapangan;
            this.tanggalSewa = tanggalSewa;
            this.jamMulai = jamMulai;
            this.durasiSewa = durasiSewa;
            this.totalBiaya = totalBiaya;
        }
    
        public String getNama() {
            return nama;
        }
    
        public String getNomorHp() {
            return nomorHp;
        }
    
        public Lapangan getLapangan() {
            return lapangan;
        }
    
        public String getTanggalSewa() {
            return tanggalSewa;
        }
    
        public String getJamMulai() {
            return jamMulai;
        }
    
        public int getDurasiSewa() {
            return durasiSewa;
        }
    
        public double getTotalBiaya() {
            return totalBiaya;
        }
    }
