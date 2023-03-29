import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int operacao, valor, cont, resultado = 0 ;
        System.out.println("1 = soma\n2 = subtração\n3 = multiplicação\n4 = divisão");
        System.out.println("Digite o tipo de operação: ");
        operacao = leitor.nextInt();
        System.out.println("Digite o numero que deseja a tabuada(1 a 10): ");
        valor = leitor.nextInt();
        switch (operacao){
            case (1):
                for(cont = 1; cont <= 10; cont++){
                    resultado = cont + valor;
                    System.out.printf("%d + %d = %d\n", cont, valor, resultado);
            }break;
            case (2):
                for(cont = valor; cont <= valor+10; cont++){
                resultado = cont - valor;
                System.out.printf("%d - %d = %d\n", cont, valor, resultado);
            }break;
            case (3):
                for(cont = 1; cont <= 10; cont++){
                resultado = cont * valor;
                System.out.printf("%d * %d = %d\n", cont, valor, resultado);
            }break;
            case (4):{
                if (valor == 0){
                    System.out.println("Um número não pode ser divisivel por 0");
                }
                else{
                    for(cont = valor; cont <= valor*10; cont = cont + valor){
                    resultado = cont / valor;
                    System.out.printf("%d / %d = %d\n", cont, valor, resultado);
                }}break;
            }
            default:
                System.out.println("Você digitou uma operação inválida");
        }
    }
}
