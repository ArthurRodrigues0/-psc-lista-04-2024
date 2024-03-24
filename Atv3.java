import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um nome: ");
        String nome = scanner.next();
    while (nome.length()<3) {
            System.out.println("Seu nome deve haver mais que tres caracteres,tente novamente. \nDigite um nome: ");
             nome = scanner.next();}

    System.out.println("Digite uma idade: ");
        Double idade = scanner.nextDouble();
    while (idade < 0 && idade > 150) {
            System.out.println("Idade dave ser de 0 a 150 anos, tente novamente. \nDigite uma idade: ");
             idade = scanner.nextDouble();}
             
     System.out.println("Digite um valor de salario: ");
        Double salario = scanner.nextDouble();
     while (salario < 0 ) {
            System.out.println("Digite um valor maior que zero. \nDigite um valor de salario: ");
        salario = scanner.nextDouble();}

    System.out.println("Digite um sexo, (M)Masculino e (F)Feminino: ");
        String sexo = scanner.next();
    while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
            System.out.println("Digite um sexo, (M)Masculino e (F)Feminino: ");
            sexo = scanner.next();}

    System.out.println("Digite um estado civil, (s)Solteiro\t (c)Casado\t (v)viuvo\t (d)Divorciado: ");
        String ST = scanner.next(); 
    while (!ST.equalsIgnoreCase("s") && !ST.equalsIgnoreCase("c") && !ST.equalsIgnoreCase("v") && !ST.equalsIgnoreCase("d") ) {
            System.out.println("Digite um estado civil, (s)Solteiro\t (c)Casado\t (v)viuvo\t (d)Divorciado: ");
            ST = scanner.next();
    }
    scanner.close();

    }
}
