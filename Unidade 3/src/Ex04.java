import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        Float nota1 = input.nextFloat();

        System.out.println("Digite a segunda nota: ");
        Float nota2 = input.nextFloat();

        System.out.println("Digite a terceira nota: ");
        Float nota3 = input.nextFloat();

        input.close();

        Double media = (nota1 * 0.5 + nota2 * 0.3 + nota3 * 0.2);

        System.out.println("A media pondera é: " + media);
    }
}