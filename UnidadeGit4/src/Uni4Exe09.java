import java.util.Scanner;
public class Uni4Exe09 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor para verificar se eles são multiplos: ");
        int numero1 = input.nextInt();

        System.out.println("Digite o segundo valor para verificar se eles são multiplos: ");
        int numero2 = input.nextInt();

        input.close();

        if (numero1 % numero2 == 0) {
            System.out.println("O primeiro numero digitado é um múltiplo do segundo numero digitado.");
        } else {
            System.out.println("O segurando numero digitado é um múltiplo do primeiro numero digitado.");
        }
        
    }
}