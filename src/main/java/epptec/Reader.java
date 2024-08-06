package epptec;

import java.util.Scanner;

public class Reader {
    Scanner scanner = new Scanner(System.in);
    public int readMenuChoice() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException exception) {
            return -1; // stand-in for any wrong number input, which will get handled in worker main loop
        }
    }

}
