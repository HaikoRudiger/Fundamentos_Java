import java.util.Scanner;
public class Uni4Exe19 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o X: ");
        int x = input.nextInt();
    
        System.out.println("Digite o Y: ");
        int y = input.nextInt();

        input.close();

        if (x == 0 && y == 0){
            System.out.println("Quadrante 0");
        } else if (x > 0 && y > 0){
            System.out.println("Quadrante 1");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else {
            System.out.println("Quadrante 4");
        }

    }
}



