/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.alexandreteste;
import java.util.Scanner;

/**
 *
 * @author alexandreadm
 */
public class NumeroMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Entre com o primeiro inteiro: ");
        n1 = sc.nextInt();
        System.out.print("Entre com o segundo inteiro: ");
        n2 = sc.nextInt();
        System.out.print("Entre com o terceiro inteiro: ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 < n3) {
                    System.out.println("O menor numero eh: " + n2);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n1);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        } else {
            if (n2 > n3) {
                if (n1 < n3) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n2);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        }
    }
}

