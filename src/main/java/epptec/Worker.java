package epptec;

import java.util.LinkedList;
import java.util.Random;
import static epptec.FilterRules.*;

public class Worker {

    Writer writer = new Writer();
    Reader reader = new Reader();
    boolean rebukeBadInput = false;

    private void populate(LinkedList<Integer> listToPopulate) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            // we populate the list with 100 integers from -99 to +99
            listToPopulate.add(random.nextInt(-99,100));
            // * (random.nextBoolean() ? -1 : 1) for negative integers if the above overload doesn't work
        }
    }

    private void filterNumbers(LinkedList<Integer> theNumbers, FilterRules filterCase) {
        for (int i = 0; i < theNumbers.size(); i++) {
            if (filterCase.evaluate(theNumbers.get(i))) { // comparison from ENUM items
                theNumbers.remove(i);
                i--; // because linkedList shifts index upon item deletion
            }
        }
    }

    private void handleFilterOptions(LinkedList<Integer> theNumbers) {
        while (true) { // to loop in case of bad input
            if (rebukeBadInput) {
                writer.writeBadInputRebuke();
                rebukeBadInput = false;
            }
            writer.writeFilterOptions();
            switch (reader.readMenuChoice()) {
                case 1: // less than zero
                    filterNumbers(theNumbers, NEGATIVES);
                    writer.writeOutNumbers(theNumbers);
                    return; // exits infinite loop by terminating the method
                case 2: // greater than zero
                    filterNumbers(theNumbers, POSITIVES);
                    writer.writeOutNumbers(theNumbers);
                    return; // exits infinite loop by terminating the method
                case 0:
                    return; // exits infinite loop by terminating the method
                default:
                    rebukeBadInput = true;
            }
        }
    }

    public void  startLoop() {

        LinkedList<Integer> randomNumbers = new LinkedList<Integer>();
        populate(randomNumbers);
        writer.writeIntro();
        writer.writeOutNumbers(randomNumbers);
        while (true) { // yes. infinite loop. perfectly valid. exit condition is clearly implemented (switch case 0)...
            if (rebukeBadInput) {
                writer.writeBadInputRebuke();
                rebukeBadInput = false;
            }
            writer.writeMenuChoices();
            switch (reader.readMenuChoice()) { // can easily be extended for double-digit input options
                case 1:
                    // show list
                    writer.writeOutNumbers(randomNumbers);
                    break;
                case 2:
                    // re-generate list (throw away and make new one)
                    randomNumbers.clear();
                    populate(randomNumbers);
                    writer.writeOutNumbers(randomNumbers);
                    break;
                case 3:
                    // filter - the actual algorithm
                    handleFilterOptions(randomNumbers);
                    break;
                case 0:
                    writer.writeOutro();
                    return; // this exits the infinite loop and returns to Main, where app cleanly finishes
                default:
                    rebukeBadInput = true;
            }
        }
    }
}
