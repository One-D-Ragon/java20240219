package ch02.lecture.p02type;

public class C05Byte {
    public static void main(String[] args) {
        // byte
        // 최소값 -128
        // 최대값 127

        // 1byte 의 저장공간으로 값 표현(저장)
        // 1byte === 8bit
        // bit = 0 또는 1

        byte a = 23;
        byte b = 127;
//        byte c = 128; // x
        byte d = -127;
        byte e = -128;
//        byte f = -129; // x

        /*
        맨 앞자리가 0이면 양수, 1이면 음수
        1000 0000 = -128 (127에서 1을 더하면 -128)
        0111 1111 = 127
        ..
        0000 0011
        0000 0010
        0000 0001 = 1
        0000 0000 = 0
        1111 1111 = -1
        1111 1110 = -2
        ...
        1000 0000 = -128
         */
    }
}
