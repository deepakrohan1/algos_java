package org.example;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * A class should be responsible for only one role
 */
public class SingleResponsibilityPrinciple {
}


class Journal {
    private List<String> entries = new ArrayList<String>();
    private long count;

    /**
     * Starts of with a basic add and remove stuff from a list
     * @param entry
     */
    public void addEntry(String entry) {
        entries.add(String.format("Count: %d Says: %s", count, entry));
        count ++;
    }

    public void removeEntry(long count) {
        entries.remove(count);
    }

    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    /**
     * Now you want to add a file. so that you can store stuff to file
     * Now this class is also dealing with concerns of file stuff `Anti-Pattern`
     * Move them to a new class
     * TODO : Refer Persistance class
     */
    /*
    public void saveToFile(String fileName) throws FileNotFoundException {
        try(PrintStream po = new PrintStream(fileName)) {
            po.println(toString());
        }
    }
    public void loadFromFile(String s) {}
    public void loadFromUrl(String s) {}
    */
}

/**
 * A class to deal with persistance and fetching logic
 */
class Persist {
    public void saveToFile(Journal journal, String fileName) throws FileNotFoundException {
        try(PrintStream po = new PrintStream(fileName)) {
            po.println(journal.toString());
        }
    }
    public void loadFromFile(String s) {}
    public void loadFromUrl(String s) {}

}
