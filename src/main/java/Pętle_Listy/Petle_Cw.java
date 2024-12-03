package Pętle_Listy;

public class Petle_Cw {
    public static void main(String[] args) {


        int[][] macierz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11},
                {12, 13, 14, 15, 16}
        };
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                System.out.println(macierz[i][j]);

            }
        }

//        0-100   ; /3 print fizz  /5 prin buzz  /3 i 5 print wuzz   else print tę liczbę

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("wuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
