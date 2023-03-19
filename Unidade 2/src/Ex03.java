import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o raio do circulo: ");
    Double raio = input.nextDouble();    
    
    Double area = 3.14159 * (raio * raio);
    
    System.out.println("Aqui está a sua Area: " + area);
    
    input.close(); // adiciona essa linha para fechar a classe Scanner
    }
}
