import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Game Tebak Kartu ===");
        System.out.print("Masukkan nama kamu: ");
        String name = scanner.nextLine();

        Game game = new Game(name);
        String ulang;

        do {
            game.playGame();
            System.out.print("\nMain lagi? (y/n): ");
            ulang = scanner.nextLine();
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terima kasih sudah bermain!");
        scanner.close();
    }
}
