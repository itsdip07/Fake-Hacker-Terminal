// Just for Fun Guys 
import java.util.Random;

public class HackerTerminal {

    public static void loading() throws InterruptedException {
        for(int i = 0; i <= 100; i += 10) {
            System.out.print("\rLoading: " + i + "%");
            Thread.sleep(300);
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {

        String[] messages = {
            "Connecting to NASA Server...",
            "Bypassing Firewall...",
            "Decrypting Passwords...",
            "Accessing Secret Files...",
            "Downloading Data...",
            "Hack Complete"
        };

        Random random = new Random();

        System.out.println("=== FAKE HACKER TERMINAL ===\n");

        for(String msg : messages) {
            System.out.println(msg);
            loading();
            Thread.sleep(1000);
        }

        System.out.println("\nACCESS GRANTED ✅");
    }
}