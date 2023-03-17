import java.util.Scanner;


public class Ex4 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.println("Digite a primeira para saber a media ponderada: ");
        Double nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        Double nota2 = input.nextDouble();

        Double resultado = (nota1 * 3.5) + (nota2 * 7.5) / 11;

        System.out.println("A sua media foi: " + Math.round(resultado)); // Math.round(resultado) está arredondando o valor

        input.close(); // adiciona essa linha para fechar a classe Scanner
    }
}
