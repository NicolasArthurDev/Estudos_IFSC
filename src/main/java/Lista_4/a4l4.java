import java.util.Scanner;

public class a4l4 {
  public static void main(String[] args) {

    System.out.println("\n\nINVERSORA DE VÁRIÁVEIS (?????)\n\n");
    Scanner sc = new Scanner(System.in);
    System.out.print("Insira o primeiro valor: ");
    int primeiroValor = sc.nextInt();
    System.out.print("Insira o segundo valor: ");
    int segundoValor = sc.nextInt();

    int aux = primeiroValor;
    primeiroValor = segundoValor;
    segundoValor = aux;

    System.out.println("\nPrimeiro valor: " + primeiroValor + "\nSegundo valor: " + segundoValor);
    sc.close();
  }
}