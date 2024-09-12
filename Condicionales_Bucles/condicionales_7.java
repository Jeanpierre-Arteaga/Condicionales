package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_7 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int n,conta=0;
        float sueldo,suma=0;
        do{
            System.out.print("Ingrese la cantidad de sueldos: ");
            n = entrada.nextInt();
        }while(n<0);
        for(int i=0;i<n;i++){
            do{
                System.out.print("Ingrese el sueldo "+(i+1)+": ");
                sueldo = entrada.nextFloat();
            }while(sueldo<0);
            suma+=sueldo;
            if(sueldo>1000){
                conta++;
            }
        }
        System.out.println("\nLa suma de sueldos: "+(suma));
        System.out.println("Cantidad de sueldos mayores a 1000: "+(conta));
        entrada.close();
    }
}