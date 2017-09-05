/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda;

public class DecimalBinario {

    public static void Calculo(int num1) {
        for (int i = 1; i <= num1; i++) {

            int n = num1 % 2;
            System.out.println(n);
            num1 = num1 / 2;

        }
    }

    public static void Calc(int num) {
        if (num > 1) {
            Calc(num / 2);
        }
        System.out.print("  "+ num % 2);

    }

    public static void main(String[] args) {

      //  Calc(10);
        Calc(16);

    }
}
