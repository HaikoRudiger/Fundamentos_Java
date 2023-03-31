import java.util.Scanner;
public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para vermos se é impar ou par: ");
        int numero = input.nextInt();

        input.close();

        int resultado = numero % 2;

        if (resultado ==  0 ){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }

        
    }
}