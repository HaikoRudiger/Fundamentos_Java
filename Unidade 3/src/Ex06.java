import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o peso do prato (em quilos): ");
        float peso = input.nextFloat();

        float pesoPrato = 0.75f; // peso do prato em quilos
        float precoQuilo = 25.0f; // preço por quilo da refeição

        float precoTotal = (peso + pesoPrato) * precoQuilo;

        System.out.println("Valor a pagar: R$" + precoTotal);

        input.close();
    }
}
