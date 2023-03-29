/* Exercício 8 – Anagrama
 * Aluno: Herick de Lima Carneiro – Matricula: 20220005754
 * Aluno: Weslley Rhaonny de Lima Freitas – Matricula: 20220155170
 */
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrama {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String primeiraPalavra = "", segundaPalavra = "";

        System.out.println("Digite a palavra que deseja: ");
        primeiraPalavra = leitor.nextLine();
        primeiraPalavra = primeiraPalavra.replaceAll(" ","");
        primeiraPalavra = primeiraPalavra.toLowerCase();
        System.out.println("digite a segunda palavra: ");
        segundaPalavra = leitor.nextLine();
        segundaPalavra = segundaPalavra.replaceAll(" ","");
        segundaPalavra = segundaPalavra.toLowerCase();
        char[] array1 = primeiraPalavra.toCharArray();
        char[] array2 = segundaPalavra.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if(Arrays.equals(array1,array2)){
            System.out.println("é um anagrama");
        }
        else{
            System.out.println("não é um anagrama");
        }


    }
}
