import java.util.*;

class Pelari extends Thread {
    private String nama;
    private int jumlahLangkah;
    private static final Object kunciPrint = new Object();
    private static int selesaiCount = 0;
    private static final List<String> ranking = new ArrayList<>();

    public Pelari(String nama, int jumlahLangkah) {
        this.nama = nama;
        this.jumlahLangkah = jumlahLangkah;
    }

    @Override
    public void run() {
        for (int i = 0; i <= jumlahLangkah; i++) {
            String bar = generateBar(i, jumlahLangkah);
            printProgress(bar);
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (ranking) {
            ranking.add(nama);
            selesaiCount++;
            if (selesaiCount == Runverse.totalPelari) {
                System.out.println("\n=== 🏁 HASIL AKHIR RUNVERSE 🏁 ===");
                for (int i = 0; i < ranking.size(); i++) {
                    System.out.printf("Juara %d: %s%n", i + 1, ranking.get(i));
                }
            }
        }
    }

    private String generateBar(int langkah, int total) {
        StringBuilder sb = new StringBuilder();
        int barLength = 20;
        int posisi = (int) ((double) langkah / total * barLength);

        for (int i = 0; i < barLength; i++) {
            if (i < posisi) sb.append("=");
            else if (i == posisi) sb.append(">");
            else sb.append(" ");
        }

        return sb.toString();
    }

    private void printProgress(String bar) {
        synchronized (kunciPrint) {
            System.out.printf("%-12s: [%s]%n", nama, bar);
        }
    }
}

public class Runverse {
    public static int totalPelari = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalLangkah = 20;
        Pelari[] pelariList = new Pelari[totalPelari];

        System.out.println("=== 🌟 WELCOME TO RUNVERSE 🌟 ===");
        for (int i = 0; i < totalPelari; i++) {
            System.out.print("Masukkan nama pelari ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();
            pelariList[i] = new Pelari(nama, totalLangkah);
        }

        System.out.println("\n=== 🔥 RUNVERSE DIMULAI 🔥 ===\n");

        for (Pelari p : pelariList) {
            p.start();
        }
    }
}
