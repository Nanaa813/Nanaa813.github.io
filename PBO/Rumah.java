public class Rumah {
    String pemilik;
    int luas_rumah;
    String warna;

    public void info() {
        System.out.println("Pemilik rumah ini adalah " + pemilik + 
                           ", luas rumahnya yaitu " + luas_rumah + 
                           " m2 dan berwarna " + warna);
    }

    public static void main(String[] args) {
        Rumah nana = new Rumah();
        nana.pemilik = "Nana";
        nana.luas_rumah = 70;
        nana.warna = "Pink";
        nana.info();
    }
}
