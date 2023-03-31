import java.util.Scanner;
public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor trabalhadas no mês: ");
        int horasTrabalhadasM = input.nextInt();

        int horas = horasTrabalhadasM * 4;
        
        System.out.println("Digite o valor pago por hora: ");
        float valorH = input.nextFloat();

        input.close();

        float salario = horasTrabalhadasM * valorH;

        if (horas > 160){
           float salarioHoraExtra = (horas - 160) * (valorH / 2);    
           float salarioTotalExtra = salario + salarioHoraExtra;
           System.out.println("O salario total mais o Extra é R$" + salarioTotalExtra);           
        } else {
            System.out.println("Você não está apto para ganhar o salario extra assim seu salario fica: " + salario);           
            
        }
    }
}
