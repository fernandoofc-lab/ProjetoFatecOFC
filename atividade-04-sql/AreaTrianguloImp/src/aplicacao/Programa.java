package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double ladoXa, ladoXb, ladoXc, ladoYa, ladoYb, ladoYc, ladoZa, ladoZb, ladoZc;

        System.out.println("Digite as medidas do triângulo X:");
        ladoXa = sc.nextDouble();
        ladoXb = sc.nextDouble();
        ladoXc = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y:");
        ladoYa = sc.nextDouble();
        ladoYb = sc.nextDouble();
        ladoYc = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Z:");
        ladoZa = sc.nextDouble();
        ladoZb = sc.nextDouble();
        ladoZc = sc.nextDouble();

        double p = (ladoXa + ladoXb + ladoXc) / 2.0;
        double areaX = Math.sqrt(p * (p - ladoXa) * (p - ladoXb) * (p - ladoXc));

        p = (ladoYa + ladoYb + ladoYc) / 2.0;
        double areaY = Math.sqrt(p * (p - ladoYa) * (p - ladoYb) * (p - ladoYc));

        p = (ladoZa + ladoZb + ladoZc) / 2.0;
        double areaZ = Math.sqrt(p * (p - ladoZa) * (p - ladoZb) * (p - ladoZc));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);
        System.out.printf("Área do triângulo Y: %.4f%n", areaZ);

        if (areaX > areaY && areaX > areaZ) {
            System.out.println("Maior área: X");
        } else if (areaY > areaZ) {
            System.out.println("Maior área: Y");
        } else {
            System.out.println("Maior área: Z");
        }
        
        sc.close();
}


