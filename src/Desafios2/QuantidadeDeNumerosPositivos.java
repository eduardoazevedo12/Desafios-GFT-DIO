/**Crie um programa que leia 6 valores, os quais poderão ser negativos
 * e/ou positivos. Em seguida, apresente a quantidade de valores positivos
 * digitados.
 *
 */
package Desafios2;

import java.util.Scanner;

public class QuantidadeDeNumerosPositivos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double n;
        int pos = 0;
        for(int i=0;i<6;i++){
            n = leia.nextDouble();
            if(n>0){
                pos++;
            }
        }
        System.out.println(pos+ "valores positivos");
    }
}
/*
import java.util.Scanner;
public class QtdeNumerosPositivos {
    public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
        double n;
        int pos = 0;
        for(int i=0;i<6;i++){
            n = leia.nextDouble();
            if(n>0){
                pos++;
            }
        }
        System.out.println(pos+ "valores positivos");
    }
}
 */