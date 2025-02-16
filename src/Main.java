public class Main {
    public static void main(String[] args) {
        String toPrint = "WORKING";

        Printer[] printers = new Printer[]{
                new FramePrinter(),
                new UglyPrinter(),
                new BasicPrinter(),
                new UpperCasePrinter(),
                new LowerCasePrinter()
        };

        Printer randomPrinter = printers[(int) (Math.random() * printers.length)];
        randomPrinter.print(toPrint);
    }
}
