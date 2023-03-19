import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
 
        System.out.println("Digite o comprimento do terreno: ");
        Float comprimento = input.nextFloat();

        System.out.println("Digite o largura do terreno: ");
        Float largura = input.nextFloat();

        Float area = comprimento * largura;

        System.out.println("A area do terreno é " + area);
        
        input.close();

    }
}
