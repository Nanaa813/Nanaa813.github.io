public class Skincare {
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
        Skincare produk1 = new Skincare();
        produk1.Produk = "Sunscreen Aqua Rich";
        produk1.Brand = "Biore"; 
        produk1.Jenis = "Sunscreen";
        produk1.Harga = 95000; 
        produk1.KandunganUtama = "Hyaluronic Acid";
        produk1.info();

        Skincare produk2 = new Skincare();
        produk2.Produk = "Hydrating Toner";
        produk2.Brand = "Hada Labo"; 
        produk2.Jenis = "Toner"; 
        produk2.Harga = 120000; 
        produk2.KandunganUtama = "Hyaluronic Acid";
        produk2.info();

        Skincare produk3 = new Skincare();
        produk3.Produk = "Niacinamide Serum"; 
        produk3.Brand = "The Ordinary"; 
        produk3.Jenis = "Serum"; 
        produk3.Harga = 150000; 
        produk3.KandunganUtama = "Niacinamide";
        produk3.info();

        Skincare produk4 = new Skincare();
        produk4.Produk = "Moisturizer Hydro Boost"; 
        produk4.Brand = "Neutrogena"; 
        produk4.Jenis = "Moisturizer"; 
        produk4.Harga = 170000; 
        produk4.KandunganUtama = "Hyaluronic Acid";
        produk4.info();
    }
}
