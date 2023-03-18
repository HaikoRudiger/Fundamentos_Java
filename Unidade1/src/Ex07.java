import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeV = input.nextLine();

        System.out.println("Digite o salario fixo: ");
        Float salarioFixo = input.nextFloat();

        System.out.println("Digite o total de vendar(Reais): ");
        Float vendas = input.nextFloat();

        Double comissaoV = vendas * 0.15;

        Double total = comissaoV + salarioFixo;

        System.out.println("O nome do vendedor é "+ nomeV + " O total para receber no final do mes é: " + String.format("%.2f",total));

        input.close();



    }
}
