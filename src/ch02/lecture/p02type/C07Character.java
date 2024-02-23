package ch02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        // char (character)
        // 2byte == 16bits
        // 0 ~ 65535
        // unicode

        char a = 99;
        char b = 120;
        char c = 65535;
//        char d = 65536; // x
//        char e = -1; // x
        char d = 969; // 10진법
        char e = 4314;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        char i = 'c'; // 99
        char j = 'ლ'; // 4314

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        char k = 0xac00;
        char l = '가';

        System.out.println("k = " + k);
        System.out.println("l = " + l);

        char m = 0xd7a3;
        char n = '힝';

        System.out.println("m = " + m);
        System.out.println("n = " + n);

        int o = 0x1f607;
        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis = " + emojis);

        int p = 0x1f3a4;
        char[] emoji2 = Character.toChars(p);
        String emojit = new String(emoji2);
        System.out.println("emojit = " + emojit);

        char q = '힣';
        char r = '😂';

        System.out.println("q = " + q);
        System.out.println("r = " + r);
    }
}
