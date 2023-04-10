import java.util.Scanner;
public class Uni4Exe13 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor das cartas");
        Integer carta1 = input.nextInt();    
        Integer carta2 = input.nextInt();
        Integer carta3 = input.nextInt();
        input.close();

        int soma = carta1 + carta2 + carta3;


        if (soma == 6) {
            System.out.println("SEIS");
        } else if (soma == 9) {
            System.out.println("NOVE");
        } else if (carta1 == 1 || carta1 == 2 || carta1 == 3 || carta2 == 1 || carta2 == 2 || carta2 == 3 || carta3 == 1 || carta3 == 2 || carta3 == 3) {
            System.out.println("TRUCO");
        }
        
        }
}