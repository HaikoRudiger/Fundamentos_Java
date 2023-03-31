import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preço dos sapatos: ");
        Float preco = input.nextFloat();
        Float desconto = preco * 0.12f; // f para indicar que é um float
        Float valor =  preco - desconto; 
        input.close();
        System.out.println("O desconto é de: R$" + desconto);
        System.out.println("O preço é de: R$" + valor);
    }
}
