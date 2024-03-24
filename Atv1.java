import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Dê uma nota de 0 a 10: ");
        Double n1 = scanner.nextDouble(); 
        
    while (n1 < 0 || n1 > 10) {
       System.out.println("Valor invalido, Tente novamente. \nDê uma nota de 0 a 10: ");
         n1 = scanner.nextDouble();
    }
        scanner.close();

    }

}