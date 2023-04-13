import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Uni4Exe24 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = input.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int numero2 = input.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int numero3 = input.nextInt();

        System.out.println("Digite a opção: ");
        System.out.println("1 - 3 valores em ordem crescente");
        System.out.println("2 - 3 valores em ordem decrescente");
        System.out.println("3 - 3 valores de forma que o maior valor fique no meio");
        int opcao = input.nextInt();

        input.close();


        switch (opcao){
            case 1:
                int[] crescente = {numero1, numero2, numero3};
                Arrays.sort(crescente);
                System.out.println("Os valores em ordem crescente é : " + Arrays.toString(crescente));
            break; 

            case 2:
                Integer[] decrescente = {numero1, numero2, numero3};
                Arrays.sort(decrescente, Collections.reverseOrder());
                System.out.println(String.join(", ", Arrays.toString(decrescente)));
            break;
            
            case 3:
                if (numero1 > numero2 && numero1 > numero3){
                    System.out.println("O maior numero fica no meio: " + numero2 + " " + numero1 + " " + numero3);
                } else if (numero2 > numero1 && numero2 > numero3){
                    System.out.println("O maior numero fica no meio: " + numero1 + " " + numero2 + " " + numero3);
                } else {
                    System.out.println("O maior numero fica no meio: " + numero1 + " " + numero3 + " " + numero2);
                }
            break;
            default:
                System.out.println("Nenhuma das opções");
            
        }

        


    }
}
