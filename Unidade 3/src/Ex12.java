import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nome = input.nextLine();

        System.out.println("Horas trabalhas mensais: ");
        Integer horasM  = input.nextInt();

        System.out.println("Numero de pessoas dependentes: ");
        Integer dependentes = input.nextInt();

        Float calculo1 = (float) ((horasM * 10) + (dependentes * 60));

        Float calculo2 = (float) (calculo1 - (calculo1 * 0.085));

        Float salario = (float) (calculo2 - (calculo2 * 0.05));

        System.out.println("O salario bruto do " + nome + " é R$" + String.format("%.2f", salario));

        input.close();

    }
}