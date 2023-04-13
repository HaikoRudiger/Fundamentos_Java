import java.util.Scanner;
public class Uni4Exe18 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Dia do vencimento: ");
        int diaV = input.nextInt();
    
        System.out.println("Dia do pagamento: ");
        int diaP = input.nextInt();

        System.out.println("Valor da Prestação: ");
        double prestacao = input.nextDouble();

        input.close();

        int dias = diaP - diaV;

        if (diaP <= diaV){
            double total = prestacao - (prestacao * 0.1);
            System.out.println("Para, ganhasse um Desconto, o desconto é de 10% e o valor a ser pago é R$ " + total);
        } else if (dias >= 1 && dias <= 5) {
            double total = prestacao;
            System.out.println("Você perdeu o seu desconto: " + total);
        } else if (dias > 5){
            double multa = dias * 0.02;
            double total = prestacao + (prestacao * multa);
            System.out.println("O valor da multa a ser pago é R$ " + total);
        } 

        
        }
}


