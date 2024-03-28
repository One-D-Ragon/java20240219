package ch18.lecture.p3writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C03Writer {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("temp/output3.txt");
            try (writer) {
                writer.write(44145);
                writer.write('가');
                writer.write(new char[]{'손', '흥', '민'});
                writer.write("hello world!");
                writer.write("😂 smile");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
