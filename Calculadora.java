/* Exercício 06 – Calculadora
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double i;
        int menu;
        Scanner leitor = new Scanner(System.in);
        System.out.println("-----OPÇÕES DE ESCOLHA-----\n");
        System.out.println(
                "0-Sair do Programa\n1-Dobro\n2-Triplo\n3-Metade\n4-Quadrado\n5-Cubo\n6-Raiz Quadrada\n7-Raiz Cúbica\n8-Módulo\n9-Inverso\n");
        System.out.println("Escolha sua operação da calculadora: ");
        System.out.println("-->");
        menu = leitor.nextInt();
        if (menu == 0) {
            System.out.println("Programa encerrado!");
        } else {
            while (menu > 0 && menu <10) {
                System.out.println("Digite o valor desejado: ");
                i = leitor.nextDouble();
                switch (menu) {
                    case 1:
                        dobro(i);
                        break;
                    case 2:
                        triplo(i);
                        break;
                    case 3:
                        metade(i);
                        break;
                    case 4:
                        quadrado(i);
                        break;
                    case 5:
                        cubo(i);
                        break;
                    case 6:
                        raizquadrada(i);
                        break;
                    case 7:
                        raizcubica(i);
                        break;
                    case 8:
                        modulo(i);
                        break;
                    case 9:
                        inverso(i);
                        break;
                }

                System.out.println("\n-----OPÇÕES DE ESCOLHA-----\n");
                System.out.println(
                        "0-Sair do Programa\n1-Dobro\n2-Triplo\n3-Metade\n4-Quadrado\n5-Cubo\n6-Raiz Quadrada\n7-Raiz Cúbica\n8-Módulo\n9-Inverso\n");
                System.out.println("Escolha sua operação da calculadora: ");
                System.out.println("-->");
                menu = leitor.nextInt();

            }
            System.out.println("Programa encerrado!");
        }

    }

    public static void dobro(double i) {
        double resultado;
        resultado = 2 * i;
        System.out.println("O dobro é " + resultado);

    }

    public static void triplo(double i) {
        double resultado;
        resultado = 3 * i;
        System.out.println("O triplo é " + resultado);

    }

    public static void metade(double i) {
        double resultado;
        resultado = i / 2;
        System.out.println("A metade é " + resultado);

    }

    public static void quadrado(double i) {
        double resultado;
        resultado = i * i;
        System.out.println("O quadrado é " + resultado);

    }

    public static void cubo(double i) {
        double resultado;
        resultado = Math.pow(i, 3);
        System.out.println("O cubo é " + resultado);

    }

    public static void raizquadrada(double i) {
        double resultado;
        resultado = Math.sqrt(i);
        System.out.println("A raiz quadrada é " + resultado);

    }

    public static void raizcubica(double i) {
        double resultado;
        resultado = Math.cbrt(i);
        System.out.println("O cubo é " + resultado);

    }

    public static void modulo(double i) {
        double resultado;
        resultado = Math.abs(i);
        System.out.println("A módulo é " + resultado);

    }

    public static void inverso(double i) {
        double resultado;
        resultado = i * (-1);
        System.out.println("O inverso é " + resultado);

    }

}
