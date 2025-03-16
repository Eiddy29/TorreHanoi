package org.example;

import java.util.Scanner;

public class TorreDeHanoi {

    // Método recursivo para resolver la Torre de Hanoi
    public static void moverATorres(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover la ficha 1 de " + origen + " a " + destino);
            return;
        }

        // Mover (n-1) fichas desde el origen al auxiliar usando el destino
        moverATorres(n - 1, origen, destino, auxiliar);

        // Mover la ficha restante desde el origen al destino
        System.out.println("Mover la ficha " + n + " de " + origen + " a " + destino);

        // Mover las (n-1) fichas desde el auxiliar al destino usando el origen
        moverATorres(n - 1, auxiliar, origen, destino);
    }
