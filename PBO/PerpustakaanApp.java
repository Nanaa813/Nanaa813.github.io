interface Meminjam {
    void pinjamBuku(String judulBuku);
}

interface Mengembalikan {
    void kembalikanBuku(String judulBuku);
}

interface PembayaranDenda {
    void bayarDenda(double jumlah);
}

abstract class User {
    protected String nama;
    protected String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public abstract void tampilkanInfo();
}

class AnggotaPerpustakaan extends User implements Meminjam, Mengembalikan, PembayaranDenda {

    public AnggotaPerpustakaan(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public void pinjamBuku(String judulBuku) {
        System.out.println(nama + " meminjam buku: " + judulBuku);
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println(nama + " mengembalikan buku: " + judulBuku);
    }

    @Override
    public void bayarDenda(double jumlah) {
        System.out.println(nama + " membayar denda sebesar Rp" + jumlah);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

public class PerpustakaanApp {
    public static void main(String[] args) {
        User user = new AnggotaPerpustakaan("Andi Nanis", "F1G123018");
        user.tampilkanInfo();

        System.out.println("-----------------------");

        Meminjam peminjam = (Meminjam) user;
        peminjam.pinjamBuku("OOP");

        Mengembalikan pengembali = (Mengembalikan) user;
        pengembali.kembalikanBuku("OOP");

        PembayaranDenda pembayar = (PembayaranDenda) user;
        pembayar.bayarDenda(5000);
    }
}
