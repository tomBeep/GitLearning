public class Main {
    public static void main(String[] args) {
        String toPrint = "snake case Test";

        Printer[] printers = new Printer[]{
                new FramePrinter(),
                new UglyPrinter(),
                new BasicPrinter(),
                new UpperCasePrinter(),
                new LowerCasePrinter(),
                new SnakeCasePrinter()
        };

        Printer randomPrinter = printers[(int) (Math.random() * printers.length)];
        randomPrinter.print(toPrint);
    }
}
