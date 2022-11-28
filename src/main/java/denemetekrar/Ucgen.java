package denemetekrar;

public class Ucgen {


    //Lutfen loop ile asagidaki sekli cikariniz:
    //     1  2  3  4  5  6
//           ;2  3  4  5  6
//             3  4  5  6
//               4  5  6
//                 5  6
//                   6 (edited)


    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j <= 1; j++) {
                System.out.print(" ");//bosluklar icin


            }
            for (int m = i; m <= 6; m++) {
                System.out.print(m + " ");//rakamlar icin

            }
            System.out.println();
        }
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");

            }
            for (int m = 6; m <= 1; m--) {
                System.out.print(m + " ");//


            }

            System.out.println();
        }
    }

    }