package Question01;

import java.util.Scanner;

public class EscadaApp {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho desejado da escada(n): ");
        int n = sc.nextInt();

        for (int nSimbolos = 1;nSimbolos <= n;nSimbolos++){
            int nEspacos = n - nSimbolos;
            for(int i = 0; i <nEspacos; i++){
                System.out.print(" ");
            }
            for (int i = 0; i< nSimbolos; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
