interface Printer {
    void print(Document d);
}

interface Scanner {
    void scan(Document d);
}

interface Fax {
    void fax(Document d);
}

class Document {}

class MultiFunctionPrinter implements Printer, Scanner, Fax {
    public void print(Document d) {
        // print logic
    }

    public void scan(Document d) {
        // scan logic
    }

    public void fax(Document d) {
        // fax logic
    }
}

class SimplePrinter implements Printer {
    public void print(Document d) {
        // print logic
    }
}

class Photocopier implements Printer, Scanner {
    public void print(Document d) {
        // print logic
    }

    public void scan(Document d) {
        // scan logic
    }
}
