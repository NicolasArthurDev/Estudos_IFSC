import java.util.Scanner;

public class a5l4 {
  public static void main(String[] args) {

    System.out.println("\n\nMEDIADORA\n\n");
    Scanner sc = new Scanner(System.in);
    System.out.print("Insira o primeiro valor: ");
      double primeiroValor = sc.nextDouble();
    System.out.print("Insira o segundo valor: ");
      double segundoValor = sc.nextDouble();
    System.out.print("Insira o terceiro valor: ");
      double terceiroValor = sc.nextDouble();

    double media = (primeiroValor + segundoValor + terceiroValor) / 3;

    System.out.println("\nA média é igual a " + media);
    sc.close();
  }
}