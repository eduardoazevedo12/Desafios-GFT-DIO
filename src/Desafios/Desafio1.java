/**Desafio
 Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre
 estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com
 a mensagem de saída esperada (exemplo abaixo).
 Entrada
 A entrada contém 2 valores inteiros.
 Saída
 Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco
 antes e depois da igualdade
 */
package Desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        int a, b, prod;
        System.out.println("Digite o valor de A: ");
        a = leia.nextInt();
        System.out.println("Digite o valor de B: ");
        b = leia.nextInt();
        prod= a*b;
        System.out.println("O produto de A x B = " +prod);

    }
}
