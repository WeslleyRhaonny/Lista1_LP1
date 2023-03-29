import java.util.Scanner;

public class OperacoesMatrizes {
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int i,j;
        Scanner leitor = new Scanner(System.in);
        for (i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.printf("Digite o valor %d %d da matriz: ", i, j);
                matriz[i][j] = leitor.nextInt();
            }
        }
        mostraMatriz(matriz);
        mediaAbaixoDiagonal(matriz);
        somaAcimadiagonal(matriz);
        mediaDiagonalPrincipal(matriz);
        menorElemento(matriz);
        somaMatriz(matriz);
    }

    public static void mostraMatriz (int a[][]) {

        int i, j;
        for (i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.printf("\n");
        }

    }
    public static void mediaAbaixoDiagonal(int a[][]) {
        int i,j,contador=0;
        float total = 0;
        for (i=0;i<4;i++){
            for(j=0;j<4;j++){
                if(i>j){
                    total = total + a[i][j];
                    contador++;
                }
            }
        }
        System.out.printf("A média aritmétrica dos elementos abaixo da diagonal princical é: %.2f\n", total/contador);
    }
    public static void somaAcimadiagonal(int a[][]) {
        int i,j,total = 0;
        for (i=0;i<4;i++){
            for(j=0;j<4;j++){
                if(j>i){
                    total = total + a[i][j];
                }
            }
        }
        System.out.printf("A soma dos elementos acima da diagonal princical é: %d\n", total);
    }
    public static void mediaDiagonalPrincipal(int a[][]) {
        int i,j,contador=0;
        float total = 0;
        for (i=0;i<4;i++){
            for(j=0;j<4;j++){
                if(i==j){
                    total = total + a[i][j];
                    contador++;
                }
            }
        }
        System.out.printf("A média aritmétrica dos elementos da diagonal princical é: %.2f\n", total/contador);
    }
    public static void menorElemento (int a[][]) {
        int i,j,menor=6000,indiceColuna=0, indiceLinha=0;
        for (i=0;i<4;i++){
            for(j=0;j<4;j++){
                if(a[i][j]<menor){
                    menor=a[i][j];
                    indiceLinha = i;
                    indiceColuna = j;
                }
            }
        }
        System.out.printf("o menor elemento da matriz está na linha %d e coluna %d, e tem valor de: %d\n", indiceLinha, indiceColuna, menor);
    }
    public static void somaMatriz(int a[][]) {
        int i,j,total=0;
        for (i=0;i<4;i++){
            for(j=0;j<4;j++){
                total = total + a[i][j];
            }
        }
        System.out.printf("A soma da matriz é: %d\n", total);
    }
}
