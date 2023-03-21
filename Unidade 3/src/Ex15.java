import java.util.Scanner;
public class Ex15 {

    public static void main(String [] args){
      Scanner input = new Scanner(System.in);
      

      System.out.println("Digite X:");
      Integer x = input.nextInt();

      System.out.println("Digite Y:");
      Integer y = input.nextInt();

      System.out.println("Digite W:");  
      Integer w = input.nextInt();
        
      System.out.println("O numero é: " + x + "" + y + "" + w);
      input.close();
    }
}
