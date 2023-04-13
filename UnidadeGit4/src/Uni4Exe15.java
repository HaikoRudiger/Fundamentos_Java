import java.util.Scanner;
public class Uni4Exe15 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite o salario: ");
        double salario = input.nextDouble();
    
        System.out.println("Digite o mês: ");
        int mes = input.nextInt();

        input.close();

        if (mes <= 12 && mes > 0) {
            double total = (salario * 0.05) + salario;
            System.out.println("Reajuste de 5% o seu salario fica em R$" + total);
        } else if (mes > 13 && mes <= 48) {
            double total = (salario * 0.07) + salario;
            System.out.println("Reajuste de 7% o seu salario fica em R$" + total);
        } else {
            System.out.println("Mês invalido ou acima dos 48 meses");
        }
       
        
        }
}

