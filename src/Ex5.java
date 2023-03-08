import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero, que seria A: ");
        int numA = input.nextInt();

        System.out.println("Digite o segundo numero, que seria B:");
        int numB = input.nextInt();

        System.out.println("Digite o terceiro numero, que seria C");
        int numC = input.nextInt();

        System.out.println("Digite o quarto numero, que seria D:");
        int numD = input.nextInt();

        int resultado = ((numA * numB) - (numC * numD));

        System.out.println("A formula é (A * B - C * D) e o resultado é: " + resultado);

        input.close();
        
    }    
}
