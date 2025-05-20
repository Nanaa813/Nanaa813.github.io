package Enkapsulasi;

public class TugasNana {
    private String nama;
    private String nim;
    private String prodi;
    private int umur;
    private char jk;
    private String alamat;
    private String noHp;
    private String email;
    private String hobi;
    private double ipk;

    // Constructor default tanpa parameter
    public TugasNana() {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.umur = 0;
        this.jk = '-';
        this.alamat = "";
        this.noHp = "";
        this.email = "";
        this.hobi = "";
        this.ipk = 0.0;
    }

    // Constructor dengan parameter
    public TugasNana(String nama, String nim, String prodi, int umur, char jk, String alamat, 
                     String noHp, String email, String hobi, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.umur = umur;
        this.jk = jk;
        this.alamat = alamat;
        this.noHp = noHp;
        this.email = email;
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
    
    public String getNIM() {
        return nim;
    }
    
    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }
    
    public void setProdi(String prodi) {
        this.prodi = prodi;
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

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobi() {
        return hobi;
    }
    
    public void setHobi(String hobi) {
        this.hobi = hobi;
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
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Alamat: " + alamat);
        System.out.println("No HP: " + noHp);
        System.out.println("Email: " + email);
        System.out.println("Hobi: " + hobi);
        System.out.println("IPK: " + ipk);
    }
}
