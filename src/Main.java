public class Main {
    public static void main(String[] args) {
        String toPrint = "WORKING";
        new FramePrinter().print(toPrint);
        new UglyPrinter().print(toPrint);
    }
}
