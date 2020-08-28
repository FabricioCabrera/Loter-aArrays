package randomjuego;

import java.util.Random;
import java.util.Scanner;

public class RandomJuego {

    int cont = 0, aux, num;
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];

    public void mostrar() {
        for (int i = 0; i < numeros.length; i++) {//For para ingresar los números por teclado.
            System.out.print("Ingrese un número para el sorteo: ");
            numeros[i] = sc.nextInt();
            for (int j = 0; j < i; j++) { //For para recorrer los números ingresados por teclado.
                if (numeros[i] == numeros[j]) {//Condición para comparar si los números ingresados son iguales.
                    cont = 1;
                }
            }
        }
        if (cont == 1) {// Condición para  mostrar mensaje de números repetidos.
            System.out.println("Error Ingresaste números repetidos");
        }
    }

    public void random() {
        if (cont != 1) { //Condición para generar el random.
            Random r = new Random();
            int ram = r.nextInt(10) + 1;
            System.out.println("El numero random es: " + ram);
            for (int i = 0; i < numeros.length; i++) {//For para recorrer los números ingresados por teclado
                if (ram == numeros[i]) {// Condición para comparar si los números ingresados son iguales al random.
                    System.out.println("Felicidades ganaste la lotería");
                    aux = numeros[i];
                }
            }
            if (ram != aux) {// Condición para mostrar mensaje de perdiste la  lotería.
                System.out.println("Lo sentimos perdiste la lotería, suerte para la próxima");
            }
        }
    }

    public static void main(String[] args) {
        RandomJuego b = new RandomJuego();
        b.mostrar();
        b.random();
    }
}
