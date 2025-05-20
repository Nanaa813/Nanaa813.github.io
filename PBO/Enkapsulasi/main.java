package Enkapsulasi;

public class Main {
    public static void main(String[] args) {
        // Menggunakan constructor default
        TugasNana datadiri = new TugasNana();

        // Set nilai atribut menggunakan setter
        datadiri.setNama("Andi Nanis Sacharina");
        datadiri.setNIM("F1G123018");
        datadiri.setProdi("Ilmu Komputer");
        datadiri.setUmur(19);
        datadiri.setJk('P');
        datadiri.setAlamat("Jl. Perintis");
        datadiri.setNoHp("082197766156");
        datadiri.setEmail("andinanis95@gmail.com");
        datadiri.setHobi("Membaca");
        datadiri.setIpk(3.75);

        // Tampilkan data menggunakan getter
        System.out.println("Nama: " + datadiri.getNama());
        System.out.println("NIM: " + datadiri.getNIM());
        System.out.println("Program Studi: " + datadiri.getProdi());
        System.out.println("Umur: " + datadiri.getUmur());
        System.out.println("Jenis Kelamin: " + datadiri.getJk());
        System.out.println("Alamat: " + datadiri.getAlamat());
        System.out.println("No HP: " + datadiri.getNoHp());
        System.out.println("Email: " + datadiri.getEmail());
        System.out.println("Hobi: " + datadiri.getHobi());
        System.out.println("IPK: " + datadiri.getIpk());

        // Tampilkan data menggunakan method tampilkanData()
        System.out.println("\nMenampilkan data menggunakan tampilkanData():");
        datadiri.tampilkanData();
    }
}
