package Printers;

import java.io.FileWriter;
import java.io.IOException;

public class PrinterFile extends AbstractPrinter {

    private String filename;

    public PrinterFile(String filename){
        this.filename="output/"+filename;
        try (FileWriter fr = new FileWriter(this.filename)) {
            fr.write("");
        } catch (IOException e) {
            System.out.println("Can't open file.");
        }
    }

    @Override
    void output(String str) {
        try (FileWriter fr = new FileWriter(filename, true)) {
            fr.write(str);
        } catch (IOException e) {
            System.out.println("Can't open file.");
        }
    }
}
