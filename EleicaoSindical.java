/* Exercício 02 – EleicaoSindical
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
import java.util.Scanner;

public class EleicaoSindical {
    public static void main(String[] args) {
        System.out.println("-----URNA ELETRÔNICA-----");
        float a = 0, b = 0, c = 0, branco = 0, nulo = 0, te, v;
        int eleitores, i;
        float pv, pa, pb, pc, pn, pbranco;
        String candidato;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a quantidade de eleitores nesta seção?");
        eleitores = leitor.nextInt();
        leitor.nextLine();
        for (i = 0; i < eleitores; i++) {
            System.out.println("Opções de voto: \nCandidato A\nCandidato B\nCandidato C\nBranco\nNulo");
            System.out.println("Qual Candidato deseja votar?");
            candidato = leitor.nextLine();
            candidato = candidato.toUpperCase();
            switch (candidato) {
                case ("A"):
                    a++;
                    break;
                case ("B"):
                    b++;
                    break;
                case ("C"):
                    c++;
                    break;
                case ("BRANCO"):
                    branco++;
                    break;
                case ("NULO"):
                    nulo++;
                    break;
                default:
                    nulo++;
                    break;
            }
        }
        // te = a + b + c + branco + nulo;
        v = a + b + c;
        System.out.println("O número de votos válidos é " + v);
        pv = (v / eleitores) * 100;
        System.out.println("O percentual de votos válidos é " + pv);
        pa = (a / eleitores) * 100;
        System.out.println("O percentual de eleitores do Candidato A é " + pa);
        pb = (b / eleitores) * 100;
        System.out.println("O percentual de eleitores do Candidato B é " + pb);
        pc = (c / eleitores) * 100;
        System.out.println("O percentual de eleitores do Candidato C é " + pc);
        pn = (nulo / eleitores) * 100;
        System.out.println("O percentual de eleitores dos Votos Nulos é " + pn);
        pbranco = (branco / eleitores) * 100;
        System.out.println("O percentual de eleitores dos Votos Brancos é " + pbranco);
        leitor.close();
    }

}
