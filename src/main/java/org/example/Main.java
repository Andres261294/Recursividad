package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de discos: ");
        int n = scanner.nextInt();

        scanner.close();

        System.out.println("Pasos para resolver la Torre de Hanoi con " + n + " discos:");
        resolverTorreDeHanoi(n, 'A', 'C', 'B');
    }
