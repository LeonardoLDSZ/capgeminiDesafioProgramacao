package Question01;

import java.util.Scanner;

public class EscadaAppEx {

    public static void main(String[] args) {

        createLadder(6);
    }

    public static String createLadder(int n) {
        int espaces;

        String asterisks = "*";

        String espace = " ";

        for (int i = 1; i <= n; i++) {
            espaces = n - i;
            System.out.println(espace.repeat(espaces) + asterisks.repeat(i));
        }
        return espace;
    }

    /*Test */
    public static String createTestUnitario(int n) {
        int espaces;

        String asterisks = "*";

        String espace = " ";

        for (int i = 1; i <= n; i++) {
            espaces = n - i;
            System.out.println(espace.repeat(espaces) + asterisks.repeat(i));
        }
        return espace;
    }
}