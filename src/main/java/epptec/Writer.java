package epptec;

import java.util.LinkedList;

public class Writer {

    public void sleepFunction(int milliseconds) { // functioned out to not have to make try-catch blocks everywhere
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            // nothing to see here
        }
    }
    public void writeIntro() {
        sleepFunction(1000);
        System.out.println("\nHello and welcome to this very simple algorithm demonstration, which took way more effort than it really should have... =D\n");
        sleepFunction(5000);
    }

    public void writeOutNumbers(LinkedList<Integer> randomNumbers) {
        System.out.println("Current numbers are:");
        sleepFunction(1000);
        randomNumbers.forEach(
            (randomNumber) -> System.out.print(randomNumber + ", ") // comma after last number has to be tolerated
            );
        System.out.println("\n");
        sleepFunction(1500);
    }

    public void writeMenuChoices() {
        System.out.println(
            "   Do what?\n" +
            "       [1] Show current numbers\n" +
            "       [2] Generate new numbers\n" +
            "       [3] Proceed to filtering\n" +
            "       [0] Quit session\n"
        );
    }

    public void writeBadInputRebuke() {
        System.out.println(
            "   Nuh uh! Wrong input...\n" +
            "   Try again.\n"
        );
    }

    public void writeFilterOptions() {
        System.out.println(
            "\n" +
            "   Filter out negative or positive numbers?\n" +
            "       [1] Negative numbers\n" +
            "       [2] Positive numbers\n" +
            "       [0] Cancel\n"
        );
    }

    public void writeOutro() {
        System.out.println("\n   Thank you for flying with Needlessly Complicated Implementation Airlines, and we hope to never see you again... =D");
        sleepFunction(2000);
        System.out.println("\n   Bye!");
        sleepFunction(500);
    }
}
