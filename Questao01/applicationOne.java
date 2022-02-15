package Questao01;

import java.util.Scanner;

/* Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
   A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
   Exemplo
   Entrada: n = 6
   Saida:           *
                   **
                  ***
                 ****
                *****
               ******
*/
public class applicationOne {

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
            System.out.println();
        }
        sc.close();
    }
}
