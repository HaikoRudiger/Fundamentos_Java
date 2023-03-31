import java.util.Scanner;
public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero maior que 0: ");
        double numero = input.nextDouble();

        input.close();


        double valor = Math.floor(numero);

        if (numero - valor == 0){
            System.out.println("O valor não tem casas decimais");
        } else {
            System.out.println("O valor tem casas decimais");
        }

    }
}