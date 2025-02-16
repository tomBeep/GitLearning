public interface Printer {
    void print(String toPrint);
}

class UglyPrinter implements Printer {
    public void print(String toPrint) {
        for (char c : toPrint.toCharArray()) {
            boolean upperCase = Math.random() > 0.5;
            System.out.print(upperCase ? Character.toUpperCase(c) : Character.toLowerCase(c));
        }
        System.out.println();
    }
}

class FramePrinter implements Printer {
    public void print(String toPrint) {
        String frame = "-".repeat(Math.max(0, toPrint.length() + 4));

        System.out.println(frame);
        System.out.println("| " + toPrint + " |");
        System.out.println(frame);
    }
}

class HtmlPrinter implements Printer {
    public void print(String toPrint) {
        System.out.println(toPrint);
    }
}

class UpperCasePrinter implements Printer {
    public void print(String toPrint) {
        System.out.println(toPrint.toUpperCase());
    }
}

class LowerCasePrinter implements Printer {
    public void print(String toPrint) {
        System.out.println(toPrint.toLowerCase());
    }
}

class CamelCasePrinter implements Printer {
    public void print(String toPrint) {
        boolean upperCaseNextChar = false;
        boolean first = true;
        for (char c : toPrint.toCharArray()) {
            if (first) {
                first = false;
                System.out.print(Character.toLowerCase(c));
            } else if (c == ' ') {
                upperCaseNextChar = true;
            } else if (upperCaseNextChar) {
                System.out.print(Character.toUpperCase(c));
                upperCaseNextChar = false;
            } else {
                System.out.print(Character.toLowerCase(c));
            }
        }
        System.out.println();
    }
}

class SnakeCasePrinter implements Printer {
    public void print(String toPrint) {
        toPrint = toPrint.replaceAll(" ", "_");
        toPrint = toPrint.toLowerCase();
        System.out.println(toPrint);
    }
}