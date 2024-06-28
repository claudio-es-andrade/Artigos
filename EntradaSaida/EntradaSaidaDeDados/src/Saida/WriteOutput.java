package Saida;

import java.io.PrintWriter;

public class WriteOutput {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out, true);
        writer.println("Hello, World!");
        writer.flush();
    }
}
