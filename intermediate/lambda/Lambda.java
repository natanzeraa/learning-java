package intermediate.lambda;

/*Java Lambda Expressions*/

public class Lambda {
    public static void main(String[] args) {
        /* Lambda functions work really well with functional interfaces, so in this demonstration, we are going to cover,
         * the usage of lambda functions using these interfaces.*/

        /* Rules
         * Expressions are limited. They to immediately return a value, cannot contain variables,
         * assignments or statements such as if or for.
         * So when you add your code block, and it has a value to return, you need to add the return statement
         * */

        // Syntax and Rules

        // 1. The simplest way to create a lambda function, is passing one or no parameter: parameter -> expression
        Printer printer = () -> System.out.println("Printing"); // No parameter
        printer.print();

        Printer2 printer2 = document -> System.out.println("Printing " + document); // One parameter
        printer2.print("document");


        // 2. When you need more parameters, add parentheses: (param1, param2) -> expression
        Printer3 printer3 = (numberOfPages, typeOfDocument, tonerPercentage)
                -> System.out.println("Printing " + numberOfPages + " pages of " + typeOfDocument + " and the toner has " + tonerPercentage + "% ink remaining.");

        printer3.print(25, "PDF", 56.25);


        // 3. If you want to create more complex operations, use curly braces and add your code: (param1, param2) -> {code block}*/
        Printer4 printer4 = (document, totalOfPages, printedPages) -> {
            int remainingPages = 0;
            double printedPagesPercentage = 0.0;

            remainingPages = totalOfPages - printedPages;
            printedPagesPercentage = ((double) printedPages / totalOfPages) * 100;

            return "Printing " + document + " at the speed of the light \n" +
                    "Printed: " + printedPages + "/" + totalOfPages + "\n" +
                    "Remaining: " + remainingPages + "\n" +
                    "Percentage: " + Math.ceil(printedPagesPercentage) + "%";
        };

        System.out.println(printer4.print("txt files", 850, 256));
    }
}
