package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        float num;
        int i=0;
        do{
            System.out.print("Ingrese un numero: ");
            num = entrada.nextFloat();
            i++;
        }while(num>=0);
        System.out.println("La cantidad de numeros (incluido el último negativo) es: "+i);
        entrada.close();
    }
}