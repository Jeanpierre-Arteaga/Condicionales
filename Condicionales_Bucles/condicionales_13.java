package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_13 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;
        do{
            System.out.print("Ingrese la cantidad de asteriscos del lado del cuadrilatero: ");
            n = entrada.nextInt();
        }while(n<0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        entrada.close();
    }
}
