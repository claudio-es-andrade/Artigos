package Saida;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class WriteBinaryFile {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("output.bin"))) {
            osw.write("Hello, World!");
            osw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}