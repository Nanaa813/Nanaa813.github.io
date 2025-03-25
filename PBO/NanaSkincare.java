public class NanaSkincare {
    String Produk;
    String Brand;
    String Jenis;
    int Harga;
    String KandunganUtama;

    public void info() {
        System.out.println("Nama Produk: " + Produk);
        System.out.println("Brand: " + Brand);
        System.out.println("Jenis: " + Jenis);
        System.out.println("Harga: Rp" + Harga);
        System.out.println("Kandungan Utama: " + KandunganUtama);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        // Biodata Mahasiswa
        String nama = "Andi Nanis Sacharina";
        String nim = "F1G123018";
        String kelas = "Genap";

        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("==============================");

        // Objek Skincare
        NanaSkincare produk1 = new NanaSkincare();
        produk1.Produk = "Sunscreen Aqua Rich";
        produk1.Brand = "Biore"; 
        produk1.Jenis = "Sunscreen";
        produk1.Harga = 95000; 
        produk1.KandunganUtama = "Hyaluronic Acid";
        produk1.info();

        NanaSkincare produk2 = new NanaSkincare();
        produk2.Produk = "Hydrating Toner";
        produk2.Brand = "Hada Labo"; 
        produk2.Jenis = "Toner"; 
        produk2.Harga = 120000; 
        produk2.KandunganUtama = "Hyaluronic Acid";
        produk2.info();

        NanaSkincare produk3 = new NanaSkincare();
        produk3.Produk = "Niacinamide Serum"; 
        produk3.Brand = "The Ordinary"; 
        produk3.Jenis = "Serum"; 
        produk3.Harga = 150000; 
        produk3.KandunganUtama = "Niacinamide";
        produk3.info();

        NanaSkincare produk4 = new NanaSkincare();
        produk4.Produk = "Moisturizer Hydro Boost"; 
        produk4.Brand = "Neutrogena"; 
        produk4.Jenis = "Moisturizer"; 
        produk4.Harga = 170000; 
        produk4.KandunganUtama = "Hyaluronic Acid";
        produk4.info();

        NanaSkincare produk5 = new NanaSkincare();
        produk5.Produk = "Gentle Cleanser"; 
        produk5.Brand = "Cetaphil"; 
        produk5.Jenis = "Cleanser"; 
        produk5.Harga = 125000; 
        produk5.KandunganUtama = "Glycerin";
        produk5.info();
    }
}
