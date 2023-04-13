import java.util.Scanner;
public class Uni4Exe20 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1  = input.nextDouble();
    
        System.out.println("Digite a nota 2: ");
        double nota2  = input.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3  = input.nextDouble();

        System.out.println("Digite a nota do exercicio: ");
        double exercicio  = input.nextDouble();
        input.close();

        double media = (nota1 + nota2 * 2 + nota3 * 3 + exercicio)/7;

        if (media >= 9){
            System.out.println("Conceito A e aprovado. Media " + media);   
        } else if (media >= 7.5 && media < 9.0){
            System.out.println("Conceito B e aprovado. Media " + media);
        } else if (media >= 6.0 && media < 7.5){
            System.out.println("Conceito C e aprovado. Media " + media);
        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("Conceito D e reprovado. Media " + media);
        } else {
            System.out.println("Conceito E e reprovado. Media " + media);
        }
        

    }
}
