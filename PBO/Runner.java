import java.util.Scanner;

public class Runner extends Thread {
    private String name;
    private static boolean pemenang = false;
    private static int urutan = 1; // Untuk menentukan urutan pelari setelah pemenang
    private static String[] urutanPelari = new String[10]; // Menyimpan nama pelari berdasarkan urutan finish
    private long startTime;

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            startTime = System.currentTimeMillis();
            for (int langkah = 1; langkah <= 20; langkah++) {
                System.out.println(name + " berlari " + langkah + " langkah...");
                Thread.sleep(500); // Kecepatan output lebih stabil
            }

            synchronized (Runner.class) {
                // Setelah pemenang, tentukan urutan pelari yang selesai
                if (!pemenang) {
                    System.out.println("\n🎉 " + name.toUpperCase() + " MENANG! 🎉");
                    pemenang = true;
                    urutanPelari[0] = name + " selesai pertama!";
                } else {
                    urutanPelari[urutan] = name + " selesai ke-" + (urutan + 1);
                    urutan++;
                }
            }

        } catch (InterruptedException e) {
            System.out.println("⚠️ " + name + " dibatalkan dari perlombaan.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==🏁 LOMBA LARI THREAD 🏁==");
        
        int jumlahPelari = 10; // Tetapkan jumlah pelari menjadi 10
        System.out.println("Jumlah pelari: " + jumlahPelari);
        
        Runner[] pelari = new Runner[jumlahPelari];

        // Input nama untuk 10 pelari
        for (int i = 0; i < jumlahPelari; i++) {
            System.out.print("Masukkan nama pelari ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();
            pelari[i] = new Runner(nama);
        }

        System.out.println("\n🚦 Perlombaan dimulai! 🚦\n");

        // Mulai semua pelari
        for (Runner r : pelari) {
            r.start();
        }

        // Tunggu semua pelari selesai
        for (Runner r : pelari) {
            try {
                r.join(); // Menunggu thread selesai
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Tampilkan urutan pelari setelah selesai
        System.out.println("\n==🏁 Urutan Finish Pelari 🏁==");
        for (String urutan : urutanPelari) {
            if (urutan != null) {
                System.out.println(urutan);
            }
        }

        scanner.close();
    }
}