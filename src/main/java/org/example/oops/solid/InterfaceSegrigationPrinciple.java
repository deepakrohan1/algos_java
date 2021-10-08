package org.example.oops.solid;


/**
 * Tells you how to separate interface into multiple interfaces
 * put the absolute minimum of code into interface
 */
public class InterfaceSegrigationPrinciple {
}

class Document {

}

/**
 * Interface with multiple functionalities
 */
interface Machine {
    void printDocument(Document document);
    void faxDocument(Document document);
    void scanDocument(Document document);
}

class ModernMultiFunctionPrinter implements Machine {

    @Override
    public void printDocument(Document document) {

    }

    @Override
    public void faxDocument(Document document) {

    }

    @Override
    public void scanDocument(Document document) {

    }
}

/**
 * Does only printing
 */
class OldFunctionPrinter implements Machine {

    @Override
    public void printDocument(Document document) {
    }

    /**
     * You can do
     * 1. Nothing: People wont know it and end up calling it anyway
     * 2. Add Exceptions:the exception has to propogate to interfaces in some
     * cases you might not have access to interface
     * @param document
     */
    @Override
    public void faxDocument(Document document) {
    }

    @Override
    public void scanDocument(Document document) {
    }
}

/**
 * Ideal way is to implement multiple interfaces
 * Keep interfaces segregated
 **/

interface Printer {
    void printDocument(Document document);
}

interface Scanner {
    void scanDocument(Document document);
}

/**
 * multiline interface to implement multiple interfaces
 */
interface MultiFunctionDevice extends Printer, Scanner {}

class JustAPrinter implements Printer {

    @Override
    public void printDocument(Document document) {

    }
}

class PhotoCopier implements Printer, Scanner {

    @Override
    public void printDocument(Document document) {

    }

    @Override
    public void scanDocument(Document document) {

    }
}

class MultiFunctionMachine implements MultiFunctionDevice {

    @Override
    public void printDocument(Document document) {

    }

    @Override
    public void scanDocument(Document document) {

    }
}