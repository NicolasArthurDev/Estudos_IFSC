package Estudos_IFSC.src.main.java.Lista_4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("\n\nMETROS PARA CENTIMETROS\n\n");
    Scanner sc = new Scanner(System.in);
    System.out.print("Insira o valor em Metros: ");
      double metros = sc.nextDouble();

    double centimetros = metros * 100;

    System.out.println("\n"+ metros + " metros é igual a " + centimetros + " centimetros.");
    sc.close();
  }
}