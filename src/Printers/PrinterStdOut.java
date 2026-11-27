package Printers;

public class PrinterStdOut extends AbstractPrinter {

    @Override
    void output(String str) {
        System.out.println(str);
    }
}
