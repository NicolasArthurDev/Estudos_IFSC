package Estudos_IFSC.src.main.java.Lista_4;

import java.util.Scanner;

public class a2l4 {
  public static void main(String[] args) {

    System.out.println("\n\nCALCULADORA ÁREA DE UM CIRCULO\n\n");

    Scanner sc = new Scanner(System.in);
    System.out.print("Defina o valor do raio: ");
    double raio = sc.nextDouble();
    double pi = 3.14;

    double area = pi * raio * raio;
    System.out.println("A área do círculo é: " + area);
    sc.close();
  }
}