package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Main {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();


        System.out.println("Insira a largura e altura do retangulo :");

        retangulo.largura = scanner.nextDouble();
        retangulo.altura = scanner.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("AREA = %.2f%n", retangulo.perimeter());
        System.out.printf("AREA = %.2f%n", retangulo.diagonal());


        scanner.close();
    }

}