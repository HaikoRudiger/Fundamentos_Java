import java.util.Scanner; 

public class Ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu numero de identificação: ");
        int numeroIden = input.nextInt();

        System.out.println("Quantas horas trabalhadas por dia: ");
        int numeroH = input.nextInt();

        System.out.println("O valor pago por hora: ");
        float valorH = input.nextFloat();

        float salario = (numeroH * valorH) * 25;

        System.out.println("O funcionario: " + numeroIden + " e o Salario do funcionario é: " + String.format("%.2f", salario)); //Formatando para duas casas decicmais

        input.close();
    }
}
