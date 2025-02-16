public class Main {
    public static void main(String[] args) {
        String toPrint = "This is text that is being printed in a random format";

        Printer[] printers = new Printer[]{
                new CamelCasePrinter()
        };

        Printer randomPrinter = printers[(int) (Math.random() * printers.length)];
        randomPrinter.print(toPrint);
    }
}
