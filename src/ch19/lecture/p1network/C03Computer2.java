package ch19.lecture.p1network;

import java.io.*;
import java.net.Socket;

public class C03Computer2 {
    public static void main(String[] args) throws IOException {
        // 서버에 연결해서 Socket 만들기
//        ServerSocket serverSocket = new Socket(8080);
        Socket socket = new Socket("172.30.1.73", 9000);

        // Socket에서 InputStream 꺼내기
        try (socket) {

            InputStream is = socket.getInputStream();
//            InputStream is = new FileInputStream(fis);
            // BufferedInputStream 연결
            BufferedInputStream bis = new BufferedInputStream(is);

            // 파일명 아무거나
            // FileOutputStream 만들기
            File file = new File("temp/output3.jpeg");
//            FileInputStream fis = new FileInputStream(file);

            FileOutputStream os = new FileOutputStream(file);
            // BufferedOutputStream 연결
            BufferedOutputStream bos = new BufferedOutputStream(os);

            // BufferedInputStream에서 읽은 데이터
            // BufferedOutputStream으로 쓰기
            byte[] data = new byte[1024];
            while (true) {
                int num = is.read(data);
                if (num == -1) break;
                bos.write(data, 0, num);
            }
            // 마지막 flush()
            bos.flush();
        }
        // 끝.

    }

}
