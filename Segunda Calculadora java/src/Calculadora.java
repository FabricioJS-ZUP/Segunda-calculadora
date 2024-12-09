/*
Aluno: Fabrício John Sullivan
Dia: 6/12/2024
Projeto: Catalisa
Professora: Laura Fumagalli Rodrigues
Atividade 4 (calculadora pro):
1. Melhore a calculadora utilizando a classe Scanner e adicionando mais funcionalidades
    1.A: adicionei a opção 5 para acrescentar a opção de Potenciação
    1.B: adicionei 6,7,8 para as novas demandas
2. Faça um laço de repetição utilizando for que imprime na tela os números de um vetor com 5 elementos
3. Faça um laço de repetição utilizando while que imprime na tela os números de um vetor com 5 elementos
4. Faça um laço de repetição utilizando do/while que imprime na tela os números de um vetor com 5 elementos
*/
// Importando biblioteca
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0; // Declaração da variável para armazenar a opção do usuário

        /*
        // ----------------------------------------------------------------------------------------------------
          Fazendo um Loop para validar a opção para assim poder separa se quer fazer conta ou fazer loop
        // ----------------------------------------------------------------------------------------------------
        */
        while (opcao < 1 || opcao > 8) {
            System.out.println("Digite para fazer cálculos: 1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão, 5 para elevar a outro número");
            System.out.println("Ou digite para fazer laços de repetição utilizando 6 para fazer com for, 7 para while e 8 para do/while");

            // Verificando se a entrada é um número inteiro
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                // Verificando se a opção está entre 1 e 8
                if (opcao < 1 || opcao > 8) {
                    System.out.println("Esta não é uma opção válida. Por favor, reescolha.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
        /*
        // ----------------------------------------------------------------------------------------------------
           Caso a opção seja 6, 7 ou 8 ele já pede os numeros para ler (com for) e em seguida vizualisa a opção escolhia para  imprimir na tela (com a escolha de loop do usuario) os números de um vetor com 5 elementos
         // ----------------------------------------------------------------------------------------------------
         */
        if (opcao >= 6 && opcao <= 8) {
            System.out.println("Escreva os 5 números do array (A cada número digite enter :");
            int[] numeros = new int[5];

            // Lendo os números do array
            for (int i = 0; i < 5; i++) {
                numeros[i] = scanner.nextInt();
            }

            // Executando a opção escolhida
            switch (opcao) {
                case 6: // Laço com for
                    System.out.println("Números do vetor (usando for):");
                    for (int i = 0; i < numeros.length; i++) {
                        System.out.println(numeros[i]);
                    }
                    break;
                case 7: // Laço com while
                    System.out.println("Números do vetor (usando while):");
                    int i = 0;
                    while (i < numeros.length) {
                        System.out.println(numeros[i]);
                        i++;
                    }
                    break;
                case 8: // Laço com do/while
                    System.out.println("Números do vetor (usando do/while):");
                    int j = 0;
                    do {
                        System.out.println(numeros[j]);
                        j++;
                    } while (j < numeros.length);
                    break;
            }

            // Fecha o scanner e termina o programa (caso tenha esolhido 6,7 e 8
            scanner.close();
            return;
        }
         /*
         // ----------------------------------------------------------------------------------------------------
         Caso a opção seja de 1 a 5, continua com as operações matemáticas.
         // ----------------------------------------------------------------------------------------------------
         */
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        double resultado = 0;

        // Realizando a operação com base na escolha do usuario
        switch (opcao) {
            case 1: // Soma
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2: // Subtração
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3: // Multiplicação
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4: // Divisão
                // Tratamento para divisão por zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case 5: // Potenciação
                resultado = Math.pow(numero1, numero2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        // Fecha o scanner caso tenha escolhida calcular algo
        scanner.close();
    }
}