/* Exercício 03 – CensoAltura
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
import java.lang.*;
import java.lang.Math;
public class CensoAltura {

    public static void main(String[] args) {
        Double altura[] = {1.58, 1.80, 1.68, 1.83, 1.40, 1.73, 1.65, 1.95, 1.84, 1.61, 1.78, 1.55, 1.59, 1.75, 1.88, 2.00, 1.90, 1.23, 1.86, 1.77};
        String sexo[] = {"M", "M", "F", "F", "F", "M", "F", "F", "M", "M", "M", "M", "F", "F", "M", "F", "F", "F", "M", "F"};
        int i, qtMasculino = 0, qtFeminino = 0;
        double maior = 0, menor = 3,  totalAlturaM= 0, totalAlturaF = 0, mediaM = 0, mediaF = 0;

        for (i=0; i<20; i++){
           if (altura[i] >= maior) {
               maior = altura[i];
           }

            if (altura[i] <= menor) {
                menor = altura[i];
            }

            if (sexo[i]=="M"){
                qtMasculino ++;
                totalAlturaM = totalAlturaM + altura[i];
            }
            else{
                qtFeminino ++;
                totalAlturaF = totalAlturaF + altura[i];
            }
        }
    mediaM = totalAlturaM/qtMasculino;
    mediaF = totalAlturaF/qtFeminino;
    float totalPessoas = altura.length;

        System.out.printf("a) A altura %.2f é a maior altura\n", maior);
        System.out.printf("   A altura %.2f é a menor altura\n\n", menor);
        System.out.printf("b) A media de altura dos mulheres é: %f\n\n", totalAlturaF/qtFeminino);
        System.out.printf("c) A media de altura das homens é: %f\n\n", totalAlturaM/qtMasculino);
        System.out.printf("d) tem um total de %d mulheres\n\n", qtFeminino);
        System.out.printf("e) tem um total de %d homens\n\n", qtMasculino);
        System.out.printf("f) a porcentagem de pessoas do sexo feminino é: %.2f porcento \n\n", (qtFeminino/totalPessoas)*100);
        System.out.printf("g) a porcentagem de pessoas do sexo masculino é: %.2f porcento \n\n", (qtMasculino/totalPessoas)*100);
    }

}
