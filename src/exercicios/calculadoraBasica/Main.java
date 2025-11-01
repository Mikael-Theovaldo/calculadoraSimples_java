package exercicios.calculadoraBasica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção: \n" +
                    "1 - SOMA \n" +
                    "2 - SUBTRAÇÃO \n" +
                    "3 - MULTIPLICAÇÃO \n" +
                    "4 - DIVISÃO \n" +
                    "0 - SAIR ");

            int opcao = ler.nextInt();

            if (opcao == 0) {
                continuar = false;
                System.out.println("Calculadora encerrada");
                break;
            } else if (opcao < 0 || opcao > 4) {
                System.out.println("Opção inválida! Escolha entre 0 e 4.");
                continue;
            } else {
                System.out.println("Digite o primeiro número:");
                float num1 = ler.nextFloat();
                System.out.println("Digite o segundo número:");
                float num2 = ler.nextFloat();

                switch (opcao) {
                    case 1:
                        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Impossível divisão por zero");
                            continue;
                        } else {
                            System.out.println(num1 / num2);
                            break;
                        }
                }
            }
        }
    }
}
