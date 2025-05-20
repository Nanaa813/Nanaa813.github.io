import java.util.Scanner;

public class Game {
    private Player player;
    private Dealer dealer;
    private int playerScore;
    private int dealerScore;

    public Game(String playerName) {
        player = new Player(playerName);
        dealer = new Dealer();
        playerScore = 0;
        dealerScore = 0;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Game Tebak Kartu: 3 Ronde ===");

        for (int ronde = 1; ronde <= 3; ronde++) {
            System.out.println("\n--- Ronde " + ronde + " ---");
            System.out.print("Tekan ENTER untuk mengambil kartu...");
            scanner.nextLine();

            player.drawCard();
            dealer.drawCard();

            int playerVal = player.getCard().getValue();
            int dealerVal = dealer.getCard().getValue();

            System.out.println(player.getName() + " dapat: " + player.getCard().getDisplayValue());
            System.out.println("Dealer dapat: " + dealer.getCard().getDisplayValue());

            if (playerVal > dealerVal) {
                System.out.println(player.getName() + " menang ronde ini!");
                playerScore++;
            } else if (playerVal < dealerVal) {
                System.out.println("Dealer menang ronde ini!");
                dealerScore++;
            } else {
                System.out.println("Ronde seri!");
            }
        }

        // Tampilkan hasil akhir
        System.out.println("\n=== Hasil Akhir Permainan ===");
        System.out.println(player.getName() + " menang " + playerScore + " ronde.");
        System.out.println("Dealer menang " + dealerScore + " ronde.");

        if (playerScore > dealerScore) {
            System.out.println("🏆 " + player.getName() + " menang permainan!");
        } else if (playerScore < dealerScore) {
            System.out.println("💀 Dealer menang permainan!");
        } else {
            System.out.println("⚔️ Permainan seri!");
        }
    }
}
