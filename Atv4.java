import java.util.Scanner;

public class Atv4 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int cidA = 80000;
    int cidB = 200000;
    int Quant = 0; 

    while (cidA <= cidB) {
        cidA *= 1.03;
        cidB *= 1.015;
        Quant++;
        System.out.println(cidA);
    }
   System.out.println("Serão necessarios " + Quant + " anos.");
    scanner.close();


    }
}