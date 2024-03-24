import java.util.Scanner;

public class Atv10 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     
 System.out.println("Digite um numero: ");
    int n1 = scanner.nextInt();
 System.out.println("Digite outro numero: ");
    int n2 = scanner.nextInt();

    int n3 = 0;
if(n1<n2){
    n3 = n1;
}else {
    n3 = n2;
}

    int D = Math.abs(n1-n2);

for(int a = 1; a < D; a++)   
    System.out.println(n3 + a +"");

    scanner.close();
}
}
