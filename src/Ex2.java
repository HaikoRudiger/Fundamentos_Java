import java.util.Scanner; 

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor para ser multiplicado: ");
        int numero1 = input.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = input.nextInt();

        int multicacao = numero1 * numero2;

        System.out.println("O seu numero multiplicado: " + multicacao);

        input.close(); // adiciona essa linha para fechar a classe Scanner
    }
}
