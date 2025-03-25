package Enkapsulasi;

public class TugasNana {
    private String nama;
    private int umur;
    private char jk;
    private String alamat;
    private double tinggiBadan;
    private String noHp;
    public String suku;
    public String hobi;
    private double ipk;

    // Constructor
    public TugasNana(String nama, int umur, char jk, String alamat, double tinggiBadan, String noHp, String suku, String hobi, double ipk) {
        this.nama = nama;
        this.umur = umur;
        this.jk = jk;
        this.alamat = alamat;
        this.tinggiBadan = tinggiBadan;
        this.noHp = noHp;
        this.suku = suku;
        this.hobi = hobi;
        this.ipk = ipk;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public char getJk() {
        return jk;
    }

    public void setJk(char jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tinggi Badan: " + tinggiBadan);
        System.out.println("No HP: " + noHp);
        System.out.println("Suku: " + suku);
        System.out.println("Hobi: " + hobi);
        System.out.println("IPK: " + ipk);
    }
}
