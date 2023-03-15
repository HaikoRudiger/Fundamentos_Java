import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor atual do Dolar: ");
        Double cotacao = input.nextDouble();

        System.out.println("Digite o valor em Dolares para converter para Real: ");
        Double dolar = input.nextDouble();

        Double resultado = cotacao * dolar;
        
        System.out.println("O valor em reais a receber: " + String.format("%.2f", resultado));
        
        input.close();
    }
    
}
