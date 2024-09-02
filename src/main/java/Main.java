import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in);


    System.out.println("---------$-------------");
    System.out.println("CÁLCULO DE IMC");

    System.out.println("---------$-------------");


    System.out.println("Escreva seu primeiro nome:");
    String nome = sc.next();

    System.out.println("");

    System.out.println("Escreva seu sobrenome:");
    String sobrenome = sc.next();

    System.out.println("");

    System.out.println("Seu nome completo é:" + nome + " " + sobrenome);

    System.out.println("");

    System.out.println("Escreva sua idade:");
    int idade = sc.nextInt();

    System.out.println("");

    System.out.println("Escreva sua altura em cm:");
    double altura = sc.nextInt();

    System.out.println("");

    System.out.println("Escreva sua massa em KG:");
    int massa = sc.nextInt();

    System.out.println("");

    System.out.println("Fórmula de cálculo do IMC:");

    double alturametro = altura / 100;
    double almulti = alturametro * alturametro;
    double pesofinal = massa / almulti;

    System.out.println("");

    System.out.println("Idade:");
    System.out.println(idade+"anos");

    System.out.println("");

    System.out.println("altura:");

    System.out.println(alturametro+"metros");

    System.out.println("");

    System.out.println("Massa:");
    System.out.println(massa+"KG");
    System.out.println("");
    System.out.println("IMC:");

    System.out.println(pesofinal);
  }
}