package ch11.ex.p8;

import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String FileWriterName = "file.txt";

//        FileWriter fw = new FileWriter(FileWriterName);

        try (FileWriter fw = new FileWriter(FileWriterName);) {
            fw.write("java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
