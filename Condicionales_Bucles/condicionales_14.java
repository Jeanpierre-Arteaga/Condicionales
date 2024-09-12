package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_14 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int m,n;
        System.out.print("Ingrese la cantidad de asteriscos del largo del rectangulo: ");
        m = entrada.nextInt();
        System.out.print("Ingrese la cantidad de asteriscos del alto del rectangulo: ");
        n = entrada.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        entrada.close();
    }
}