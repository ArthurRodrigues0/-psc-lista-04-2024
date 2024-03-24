import java.util.Scanner;

public class Atv8 {
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


     Double soma = n1+n2+n3+n4+n5;
     Double media = (n1+n2+n3+n4+n5) / 5;
    
    
        System.out.println("A soma dos numeros é " + soma);
        System.out.println("E a media é " + media);

    scanner.close();

 }
}
