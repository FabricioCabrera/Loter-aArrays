package randomjuego;

import java.util.Random;
import java.util.Scanner;

public class RandomJuego {

    int cont, aux, num;
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];

    public void mostrar() {
        for (int i = 0; i < numeros.length; i++) {//For para ingresar los números por teclado.
            cont = 0;
            System.out.print("Ingrese un número para la posición: " + i + " en el sorteo: ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > 10 || aux < 0) {//Condición para verificar si los números ingresados son mayores o menores.
                System.out.println("Los números ingresados no son validos dentro del juego");
                i--;
            }
            for (int j = 0; j < i; j++) { //For para recorrer los números ingresados por teclado.
                if (numeros[i] == numeros[j]) {//Condición para comparar si los números ingresados son iguales.
                    cont = 1;
                    System.out.println("Error Ingresaste números repetidos");
                    i--;
                } else {
                    aux = numeros[i];
                }
            }
        }

    }

    public void random() {
        int d = 0;
        if (cont != 1) { //Condición para generar el random.
            Random r = new Random();
            int ram = r.nextInt(10) + 1;
            System.out.println("El numero random es: " + ram);
            for (int i = 0; i < numeros.length; i++) {//For para recorrer los números ingresados por teclado
                if (ram == numeros[i]) {// Condición para comparar si los números ingresados son iguales al random.
                    d = numeros[i];
                } else {
                    aux = numeros[i];
                }
            }
            if (ram == aux) {//Condición para mostrar mensaje de perdiste la  lotería.
                System.out.println("Lo sentimos perdiste la lotería, suerte para la próxima");
            }
            if (ram == d) {
                System.out.println("Felicidades ganaste la lotería");
            }
        }
    }

    public static void main(String[] args) {
        RandomJuego b = new RandomJuego();
        b.mostrar();
        b.random();
    }
}
