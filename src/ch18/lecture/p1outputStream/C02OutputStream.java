package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02OutputStream {
    public static void main(String[] args) throws InterruptedException, IOException {
        OutputStream os = new FileOutputStream("temp/output2.data");

        os.write(12312);
        os.write(1233523);

        Thread.sleep(10_000);

        os.write(5341236);
        os.write(56431);

        os.flush(); // 아직 스트림에 출력되지 않은 데이터들을 강제 출력
        os.close(); // 꼭 작성해야함
    }
}
