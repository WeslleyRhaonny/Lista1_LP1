import java.util.Scanner;

public class ClubeDeCampo {
    public static void main(String[] args) {
        int numUsuarios, i, qt10=0, qt15=0, qt21=0, qtMaisVelhos=0;
        int totalAltura10 = 0, totalAltura15 = 0, totalAltura21 = 0, totalAlturaMaisVelhos = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de usuários que quer cadastrar: ");
        numUsuarios = leitor.nextInt();
        String s1 = new String();
        String s2 = new String();
        int idade[] = new int[numUsuarios], altura[] = new int[numUsuarios];

        if (1 > numUsuarios || numUsuarios > 10) {
            System.out.println("O usuário é invalido, digite algum valor entre 1 e 10");
        } else {
            for (i = 0; i < numUsuarios; i++) {
                System.out.println("Digite a idade do usuário: ");
                idade[i] = leitor.nextInt();
                System.out.println("digite da altura do usuario em cm: ");
                altura[i] = leitor.nextInt();

                if(idade[i]<=10){
                    totalAltura10 = totalAltura10 + altura[i];
                    qt10++;
                }
                else if(idade[i]>10 && idade[i]<=15){
                    totalAltura15 = totalAltura15 + altura[i];
                    qt15++;
                }
                else if(idade[i]>15 && idade[i]<=21){
                    totalAltura21 = totalAltura21 + altura[i];
                    qt21++;
                }
                else{
                    totalAlturaMaisVelhos = totalAlturaMaisVelhos + altura[i];
                    qtMaisVelhos++;
                }
            }
        }
        if(qt10==0){
            System.out.println("Não Existe usuários na Faixa 1\n");
        }
        else {
            System.out.printf("A média de altura dos usuários na faixa 1 é: %d cm\n", totalAltura10 / qt10);
        }

        if(qt15==0){
            System.out.println("Não Existe usuários na Faixa 2\n");
        }
        else {
            System.out.printf("A média de altura dos usuários na faixa 2 é: %d cm\n", totalAltura15 / qt15);
        }

        if(qt21==0){
            System.out.println("Não Existe usuários na Faixa 3\n");
        }
        else {
            System.out.printf("A média de altura dos usuários na faixa 3 é: %d cm\n", totalAltura21 / qt21);
        }

        if(qtMaisVelhos==0){
            System.out.println("Não Existe usuários na Faixa 4\n");
        }
        else {
            System.out.printf("A média de altura dos usuários na faixa 4 é: %d cm\n", totalAlturaMaisVelhos / qtMaisVelhos);
        }
    }
}
