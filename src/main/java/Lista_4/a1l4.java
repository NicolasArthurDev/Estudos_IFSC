import java.util.Scanner;

public class a1l4 {
  public static void main(String[] args) {

    System.out.print("Defina o valor de X: ");

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.print("Defina o valor de Y: ");
    int y = sc.nextInt();

    System.out.println("\nQual será a operação?\n 1 - Soma\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão");

    int operacao = sc.nextInt();

    switch (operacao) {
      case 1:
        System.out.println("O resultado da soma é: " + (x + y));
        break;
      case 2:
        System.out.println("O resultado da subtração é: " + (x - y));
        break;
      case 3:
        System.out.println("O resultado da multiplicação é: " + (x * y));
        break;
      case 4:
        System.out.println("O resultado da divisão é: " + (x / y));
        break;
      default:
        break;
    }
    sc.close();
  }
}