package randomjuego;

import java.util.Random;
import java.util.Scanner;

public class RandomJuego {

    int cont = 0, aux;
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[3];

    public void mostrar() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un número para el sorteo");
            numeros[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    cont = 1;
                }
            }
        }
        if (cont == 1) {
            System.out.println("Error Ingresaste números repetidos");
        }
    }
    public void random(){
        if (cont != 1) {
            Random r = new Random();
            int ram = r.nextInt(3) + 1;
            System.out.println("el numero random es: " + ram);
            for (int i = 0; i < numeros.length; i++) {
                if (ram == numeros[i]) {
                    System.out.println("Felicidades ganaste:");
                    aux = numeros[i];
                }
            }
            if (ram != aux) {
                System.out.println("Lo sentimos mucha suerte para la próxima");
            }
        }
    }
    public static void main(String[] args) {
        RandomJuego b = new RandomJuego();
        b.mostrar();
        b.random();
    }
}
