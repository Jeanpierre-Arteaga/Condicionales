package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        float sueldo,sueldoMaximo=0;
        do{
            System.out.print("Ingrese la cantidad de sueldos: ");
            n = entrada.nextInt();
        }while(n<0);
        for (int i=0;i<n;i++){
            do{
                System.out.print("Ingrese el sueldo "+(i+1)+": ");
                sueldo = entrada.nextFloat();
            }while(sueldo<0);
            if(sueldo>sueldoMaximo){
                sueldoMaximo = sueldo;
            }
        }
        System.out.println("El sueldo máximo es: "+sueldoMaximo);
        entrada.close();
    }
}