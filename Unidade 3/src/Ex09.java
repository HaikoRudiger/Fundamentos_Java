import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a altura: ");
        Float altura = input.nextFloat();

        System.out.println("Digite o raio: ");
        Float raio = input.nextFloat();

        Float resultado = (float) (3.1415 * Math.pow(raio, 2) * altura);
        
        System.out.println("O resultado foi: " + resultado);

        input.close();
    }
    
}
