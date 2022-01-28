package Desafios2;

import java.util.Scanner;

public class BatalhaDeDigtrons {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        int T,B, A1,D1,L1,A2,D2,L2,V1,V2;
        T= leia.nextInt();
        for(int i=0; i<T;i++){
            B = leia.nextInt();
            A1 = leia.nextInt();
            D1 = leia.nextInt();
            L1 = leia.nextInt();
            A2 = leia.nextInt();
            D2 = leia.nextInt();
            L2 = leia.nextInt();

            V1 = (((A1+D1)/2)+B) + (L1 % 2 == 0 ? B : 0);
            V2 = (((A2+D2)/2)+B) + (L2 % 2 == 0 ? B : 0);
            if (V1>V2) System.out.println("Bruno");
            else if (V2>V1) System.out.println("Guarte");
            else System.out.println("Empate");
        }

        }
    }
