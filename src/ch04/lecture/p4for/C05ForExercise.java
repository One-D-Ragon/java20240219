package ch04.lecture.p4for;

public class C05ForExercise {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }
        System.out.println();

        // 강사님 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");

        /*
         *
         **
         ***
         ****
         *****
         */
        for (int i = 5; i > 0; i--) {
            System.out.println();
            for (int j = i; j <= 5; j++)
                System.out.print("*");
        }
        System.out.println();
        System.out.println();

        // 강사님 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------");

        /*
         *****
         ****
         ***
         **
         *
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = i; j <= 5; j++)
                System.out.print("*");
        }
        System.out.println();
        System.out.println();

        // 강사님 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        /*
         *****
         ****#
         ***##
         **###
         *####
         #####
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = i; j <= 5; j++)
                System.out.print("*");
            for (int k = i; k > 0; k--)
                System.out.print("#");
        }
        System.out.println();
        System.out.println();

        // 강사님 코드
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        /*
        .은 공백
         ....*
         ...**
         ..***
         .****
         *****
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = i; j <= 5; j++)
                System.out.print(" ");
            for (int k = i; k > 0; k--)
                System.out.print("*");
        }
        System.out.println();
        System.out.println();

        // 강사님 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        /*
        .은 공백
         *****
         .****
         ..***
         ...**
         ....*
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int k = i; k > 0; k--)
                System.out.print(" ");
            for (int j = i; j <= 5; j++)
                System.out.print("*");
        }
        System.out.println();
        System.out.println();

        // 강사님 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (5 - i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        /*
         0
         01
         012
         0123
         01234
         */
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++)
                System.out.print(j);
        }
        System.out.println();
        System.out.println();

        // 강사님 코드
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        /*
         1
         12
         123
         1234
         12345
         */


        // 강사님 코드
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-----------------------");
    }
}
