import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double n3 = scanner.nextDouble();
    
        System.out.print("Digite o quarto numero: ");
        double n4 = scanner.nextDouble();       

        System.out.print("Digite o quinto numero: ");
        double n5 = scanner.nextDouble();

    if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5) {
        System.out.println("O maior numero é: " + n1);
    } else if (n2 >= n1 && n2 >= n3 && n2 >= n4 && n2 >= n5) {
        System.out.println("O maior numero é: " + n2);
    } else if (n3 >= n1 && n3 >= n2 && n3 >= n4 && n3 >= n5) {
        System.out.println("O maior numero é: " + n3); 
    } else if (n4 >= n1 && n4 >= n3 && n4 >= n2 && n4 >= n5) {
        System.out.println("O maior numero é: " + n4);
    } else if (n5 >= n1 && n5 >= n3 && n5 >= n2 && n5 >= n4) {
        System.out.println("O maior numero é: " + n5);
  }

  scanner.close();
 }
}
