import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o comprimento em metros: ");
        Float comprimento = input.nextFloat();
        
        System.out.println("Digite o altura em metros: ");
        Float altura = input.nextFloat();

        Float area = comprimento * altura;

        Float azulejos = area / 9;

        Float custo = (float) (azulejos * 12.50);

        System.out.println("O custo sera de R$" + custo);

        input.close();


    }
}