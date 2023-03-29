/* Exercício 04 – RhEmpresa
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
import java.util.Scanner;

public class RhEmpresa {
    public static void main(String[] args) {
        int i, n;
        float ms = 0, somaSalario = 0, mediaSalarial;
        String nomeMaiorSalario = "";
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionários: ");
        n = leitor.nextInt();
        String[] nome = new String[n];
        Float[] salario = new Float[n];
        if (n <= 0)
            System.out.println("Quantidade de funcionários inválida!");
        else if (n < 40) {
            for (i = 0; i < n; i++) {
                System.out.println("Qual nome do funcionário? ");
                nome[i] = leitor.next();
                System.out.println("Qual salário do funcionário? ");
                salario[i] = leitor.nextFloat();
            }
        } else {
            System.out.println("Quantida de funcionários excedida!");
        }
        for (i = 0; i < n; i++) {
            if (salario[i] > ms) {
                ms = salario[i];
                nomeMaiorSalario = nome[i];
            }
            somaSalario = somaSalario + salario[i];
        }
        mediaSalarial = somaSalario / n;
        System.out.printf("O maior salário é %.2f\n", ms);
        System.out.printf("A média salarial é %.2f\n", mediaSalarial);

        for (i = 0; i < n; i++) {
            if (salario[i] == ms)
                System.out.println("Fununcionário que possui o salário igual ao maior salário observado: " + nome[i]);
        }
        for (i = 0; i < n; i++) {
            if (salario[i] < mediaSalarial)
                System.out.println("Funcionário que possui salario menor que a media: " + nome[i]);
        }
        leitor.close();

    }

}
