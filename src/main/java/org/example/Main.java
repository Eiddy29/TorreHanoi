package org.example;

import java.util.Scanner;

public class TorreDeHanoi {

    // Método recursivo para resolver la Torre de Hanoi
    public static void moverTorres(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        // Mover (n-1) discos desde el origen al auxiliar usando el destino
        moverTorres(n - 1, origen, destino, auxiliar);

        // Mover el disco restante desde el origen al destino
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        // Mover los (n-1) discos desde el auxiliar al destino usando el origen
        moverTorres(n - 1, auxiliar, origen, destino);
    }