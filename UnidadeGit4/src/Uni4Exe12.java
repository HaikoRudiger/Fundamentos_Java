import java.util.Scanner;
public class Uni4Exe12 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite o lado 1: ");
        Double lado1 = input.nextDouble();
    
        System.out.println("Digite o lado 2: ");
        Double lado2 = input.nextDouble();

        System.out.println("Digite o lado 3: ");
        Double lado3 = input.nextDouble();

        input.close();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Não é possível formar um triângulo com os valores informados");
        }
        
        }
}