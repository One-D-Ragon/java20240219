package ch18.lecture.p1outputStream;

import ch15.sec05.exam03.Person;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C09OutputStream {
    public static void main(String[] args) {
        String fileName = "temp/output9.data";
        try (OutputStream os = new FileOutputStream(fileName)) {

            os.write(23434); // 1 byte 쓰기

            byte[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

            os.write(data); // 10 bytes 쓰기
            os.write(data, 0, 10); // 10 bytes 쓰기 -> 어디부터 몇개
            os.write(data, 5, 3); // 3 bytes 쓰기 -> 5번 인덱스부터 3개

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
