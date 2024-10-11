package intermediate.lambda;

@FunctionalInterface
interface Printer {
    void print();
}

@FunctionalInterface
interface Printer2 {
    void print(String document);
}

@FunctionalInterface
interface Printer3 {
    void print(int numberOfPages, String typeOfDocument, double tonerPercentage);
}

@FunctionalInterface
interface Printer4 {
    String print(String document, int totalOfPages, int printedPages);
}
