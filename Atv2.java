import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um nome de usuario: ");
        String nome = scanner.next();
    System.out.print("Digite uma senha: ");
        String senha = scanner.next();

    while (nome.equalsIgnoreCase(senha)) {
        System.out.print("Erro. \nDigite a senha difernte do nome de usuario. \nDigite uma senha:  ");
            senha = scanner.next();
    }
    scanner.close();

    }

    
}
