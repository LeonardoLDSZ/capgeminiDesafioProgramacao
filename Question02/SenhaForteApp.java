package Question02;

import java.util.Scanner;

public class SenhaForteApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String senhaForte = "^(?:(?=.*\\d)(?=.*[!@#$%^&*()-+])(?=.*[a-z])(?=.*[A-Z]).*)$";

        System.out.println("\nPara concluir seu cadastro, por favor, informe um nome e crie uma senha forte.");
        System.out.println("=== === ===");
        System.out.println("Para a senha ser considerada forte, é necessário que esta preencha os requisitos que seguem:" + "\n" +
                "- Ter no mínimo 6 caracteres;" + "\n" +
                "- Ter ao menos 1 dígito;" + "\n" +
                "- Ter ao menos 1 caracter mínusculo;" + "\n" +
                "- Ter ao menos 1 caracter maiusculo; e" + "\n" +
                "- Ter ao menos 1 caracter especial (!@#$%^&*()-+)."
        );

        System.out.print("\nInforme seu nome: ");
        String nome = sc.next();
        System.out.print("Informe sua senha: ");
        String senha = sc.nextLine();


        while (sc.hasNextLine()) {
            senha = sc.next();
            if (senha != null) {
                if (senha.length() >= 6 && senha.matches(senhaForte)) {
                    System.out.println("\n=== === === === === === === === === === ");
                    System.out.println("Senha válida e forte, cadastro concluído " + nome + "!");
                    System.out.println("=== === === === === === === === === === ");
                    return;
                } else {
                    System.out.println("\n=== ATENÇÃO ===");
                    if (senha.length() < 6) {
                        int sum = 6 - senha.length();
                        System.out.println("- A Senha deve possuir no mínimo 6 caracteres e, ainda restam " + sum + " caracteres a serem informados");
                    } else {
                        System.out.println("- O número mínimo de caracteres foi atingido, contudo, verifique os demais requisitos para a senha.");
                    }
                }
                System.out.println("=== === ===");
                System.out.print("\nInforme nova senha:");
            }
        }
        sc.close();
    }
}





