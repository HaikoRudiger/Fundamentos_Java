import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de B: ");
        int b = input.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = input.nextInt();

        System.out.println("Digite o valor de D: ");
        int d = input.nextInt();

        int a = b; 

        System.out.println("O valor de A é: " + a);

        input.close();
    }
}