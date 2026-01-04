// NÚMERO PRIMO

import java.util.Scanner;

public class Primo {
            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("  Verifica número Primo\n");

        do {
            System.out.print(" (0 para sair)\n Digite um número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("\n Programa encerrado.\n");
                break;
            }

            boolean primo = true;

            if (numero <= 1) {
                primo = false;
            } else {
                for (int i = 2; i * i <= numero; i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println("\n É PRIMO \n");
            } else {
                System.out.println("\n NÃO é primo \n");
            }

        } while (numero != 0);

        scanner.close();
    }
}
