import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o número de dobras: ");
        int numDobras = input.nextInt();
        
        int numQuadrados = (int) Math.pow(2, numDobras/2 + 1) - 1;
        
        System.out.println("Número de quadrados visíveis após desdobrar o papel: " + numQuadrados);
        
        input.close();
    }
}

/*
 Função Math.pow() para elevar 2 ao expoente (num_dobras/2 + 1),
 e convertemos o resultado para int para obter um número inteiro
 de quadrados.
*/