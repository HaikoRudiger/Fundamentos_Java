import java.util.Scanner;

public class ExExtraUnidade4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço de chip de identificação do pé direito: ");
        Float pe = input.nextFloat();

        
        System.out.println("Digite o preço de chip de alimetação do pé esquerdo: ");
        Float peesquerdo = input.nextFloat();

        System.out.println("Digite a quantidade de galihazinhas: ");
        Float galihazinhas = input.nextFloat();
        
        Float soma = galihazinhas * (pe + (peesquerdo * 2));

        System.out.println("O valor das anilias: " + soma + " reais.");

        input.close();

    }
}