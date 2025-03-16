package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de discos: ");


        public static void resolverTorreDeHanoi(int n, char origen, char destino, char auxiliar) {
            if (n == 1) {
                System.out.println("Mover disco 1 de " + origen + " a " + destino);
            } else {
                resolverTorreDeHanoi(n - 1, origen, auxiliar, destino);
                System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
                resolverTorreDeHanoi(n - 1, auxiliar, destino, origen);
            }
        }
    }