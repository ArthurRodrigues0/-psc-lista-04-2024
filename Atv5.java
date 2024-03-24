import java.util.Scanner;

public class Atv5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 System.out.println("Informe a quantidade de habitantes da cidade A:");    
    int cidA= scanner.nextInt();
 System.out.println("Informe a quantidade de habitantes da cidade B:"); 
    int cidB = scanner.nextInt();
 System.out.println("Informe a taxa de crescimento da cidade A:"); 
    double taxa1 = scanner.nextDouble();
 System.out.println("Informe a taxa de crescimento da cidade B:");
    double taxa2 = scanner.nextDouble();
    int Quant = 0; 

    while (cidA <= cidB) {
        cidA *= taxa1;
        cidB *= taxa2;
        Quant++;
        System.out.println(cidA);
    }

System.out.println("Serão necessarios " + Quant + " anos.");

System.out.println("Se deseja repetir digite a tecla (Q).");
    String QR= scanner.next();

while (QR.equalsIgnoreCase("q")) {
    System.out.println("Informe a quantidade de habitantes da cidade A:");
    cidA= scanner.nextInt();
    System.out.println("Informe a quantidade de habitantes da cidade B:"); 
     cidB = scanner.nextInt();
 System.out.println("Informe a taxa de crescimento da cidade A:"); 
     taxa1 = scanner.nextDouble();
 System.out.println("Informe a taxa de crescimento da cidade B:");
     taxa2 = scanner.nextDouble();
     Quant = 0; 
     while (cidA <= cidB) {
        cidA *= taxa1;
        cidB *= taxa2;
        Quant++;
        System.out.println(cidA);
        
    }
    System.out.println("Serão necessarios " + Quant + " anos.");
     System.out.println("Se deseja repetir digite a tecla (Q)");
      QR = scanner.next();
        }
 scanner.close();
    }
}
