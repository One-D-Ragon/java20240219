package ch18.ex.p10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws Exception {
        String srcFilePath = "";
        String desFilePath = "";

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        try (in; br;) {
            System.out.print("원본 파일 경로:");
            srcFilePath = br.readLine();

            System.out.println("복사 파일 경로:");
            desFilePath = br.readLine();

            File srcFile = new File(srcFilePath);

            if (srcFile.exists()) {
                File desFile = new File(desFilePath);
                File folder = desFile.getParentFile();
                if (!folder.exists()) {
                    folder.mkdirs();
                }

                InputStream is = new FileInputStream(srcFile);
                BufferedInputStream bis = new BufferedInputStream(is);

                OutputStream os = new FileOutputStream(desFile);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (is; bis; os; bos;) {
                    byte[] data = new byte[1024];
                    int len = 0;

                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }

                    System.out.println("복사가 성공되었습니다.");
                }

            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
        }


        /*
        // File 객체 생성
        String filePath = "temp/dir/photo1.jpg";
        File file = new File(filePath);

        // 존재하지 않으면 디렉토리 또는 파일 생성
        System.out.println("file.exists() = " + file.exists());

        if (!file.exists()) {
            System.out.println("원본 파일이 존재하지 않습니다.");
            file.mkdirs(); // directory 만들기
            file.createNewFile();
        }

        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isDirectory() = " + file.isDirectory());

        // 입출력 스트림 + 버퍼 스트림 생성
        String copyName = "temp/dir2/photo2.jpg";
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(copyName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);


        // 버퍼를 사용하고 복사
        byte[] data = new byte[1024];
        while (true) {
            int num = bis.read(data);
            if (num == -1) break;
            bos.write(data, 0, num);
        }
        System.out.println("복사가 성공되었습니다.");

        bos.flush();
        bos.close();
        bis.close();
         */

    }
}
