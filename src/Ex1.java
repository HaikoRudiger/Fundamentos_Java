import java.util.Scanner; //Para ler valores, a partir do console. 

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Permite a leitura de dados a partir do console(entrada padrão).

        System.out.print("Digite um valor: ");
        int numero1 = input.nextInt(); // le um numero e armazena na variavel numero1

        System.out.print("Digite o segndo valor: ");
        int numero2 = input.nextInt();

        System.out.println("O primeiro numero digitado: " + numero1);
        System.out.println("O segundo numero digitado: " + numero2);

        input.close(); // adiciona essa linha para fechar a classe Scanner
    }
}
