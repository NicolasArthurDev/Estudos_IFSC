import java.util.Scanner;

public class a3l4 {
  public static void main(String[] args) {

    System.out.println("\n\nCALCULADORA FAHRENHEIT PARA CELSIUS\n\n");
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o valor da temperatura em Fahrenheit: ");
    int fahrenheit = sc.nextInt();

    int celsius = (fahrenheit - 32) * 5 / 9;
    System.out.println("\n" + fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");

    sc.close();
  }
}