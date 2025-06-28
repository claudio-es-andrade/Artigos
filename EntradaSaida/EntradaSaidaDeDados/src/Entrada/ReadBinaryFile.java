package Entrada;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class ReadBinaryFile {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("/home/claudio/Documentos/IdeaProjects/EntradaSaidaDeDados/src/Resources/schema.sql"))) {
            int c;
            while ((c = isr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
