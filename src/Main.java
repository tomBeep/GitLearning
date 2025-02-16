public class Main {
    public static void main(String[] args) {
        String toPrint = "This is text that is being printed in a random format";

        // This array should contain all available printers.
        Printer[] printers = new Printer[]{
                new CamelCasePrinter() // FIX ME: why is there only 1 printer??
        };

        Printer randomPrinter = printers[(int) (Math.random() * printers.length)];
        randomPrinter.print(toPrint);
    }
}
