package exercicios.calculadoraSimples;

import java.util.Scanner;

public class CalculadoraSimples {

    public static float soma(float num1, float num2) {
        // Criando o metodo -soma- inicializando dentro do parametro as variaveis "num1" e "num2"

        return num1 + num2;     // "return retorna o resultado da soma.
    }

    public static float subtracao(float num1, float num2) {

        return num1 - num2;
    }

    public static float multiplicacao(float num1, float num2) {

        return num1 * num2;
    }

    // divisao utilizando metodo com retorno.
    public static float divisao(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Impossível divisão por zero");
        } else {
            return num1 / num2;
        }
    }
    // divisao utilisando o metodo void
    public static void divisaoVoid(float num1, float num2){
        if (num2 == 0) {
            System.out.println("Impossível divisão por zero");
        } else {
            System.out.println(num1 / num2);
        }

    }

    public static void ExecutandoCalculadora() {
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
            }

            else if (opcao < 0 || opcao > 4) {
                System.out.println("Opção inválida! Escolha entre 0 e 4.");
                continue;
            }
            else {
                System.out.println("Digite o primeiro número:");
                float num1 = ler.nextFloat();

                System.out.println("Digite o segundo número:");
                float num2 = ler.nextFloat();

                try {

                    switch (opcao) {
                        case 1:
                            System.out.println(num1 + " + " + num2 + " = " + soma(num1, num2));
                            break;
                        case 2:
                            System.out.println(num1 + " - " + num2 + " = " + subtracao(num1, num2));
                            break;
                        case 3:
                            System.out.println(num1 + " * " + num2 + " = " + multiplicacao(num1, num2));
                            break;
                        case 4:
                            System.out.println(num1 + " / " + num2 + " = " + divisao(num1, num2));
                            break;

                    /*
                    caso escolhesse utilizar o metodo 'void', no trecho do codigo acima
                       ficaria assim:

                       case 4:
                       divisaoVoid(num1, num2);
                       break;
                    */
                    }

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());

                }
            }

        }

        ler.close();
    }

    public static void main(String[] args) {
        ExecutandoCalculadora();
    }
}
