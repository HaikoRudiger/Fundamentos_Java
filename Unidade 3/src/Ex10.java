import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a hipotenusa: ");
        Float hip = input.nextFloat();

        System.out.println("Digite a cateto 1: ");
        Float cateto1 = input.nextFloat();

        System.out.println("Digite a cateto : ");
        Float cateto = input.nextFloat();

        Float resultado = (float) ((float) Math.pow(hip, 2) + Math.pow(cateto1, 2) + Math.pow(cateto, 2));
        
        System.out.println("O resultado foi: " + resultado);

        input.close();
    }
    
}
