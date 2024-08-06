package epptec;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello world!"); // obligatory... =D

        // task:
        // Prosím napište algoritmus (jazyk volný - java, python, javascript, atd...), který ze seznamu vytřídí prvky podle nějakých pravidel, včetně příkladu takového pravidla.
        // Tzn. ať je tam sekce, kam se doplní konkrétní pravidla, prvky budou někde mimo v seznamu, který algoritmus projde a smaže hodnoty, které neprošly pravidly.

        // we make all nice and object-oriented, even though the task is a very simple algorithm
        // we choose LinkedList, because it is more efficient for deleting in the middle of the list
        // for simplicity, we make the list of <Integer> type and populate with integers -99 to +99
        // we provide two filtering options - delete negative numbers or positive numbers
        // nicely looping menu is provided

        Worker worker = new Worker();
        worker.startLoop();









    }
}