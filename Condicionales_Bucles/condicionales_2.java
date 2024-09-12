package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_2 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        float num;
        do{
            System.out.print("Ingrese un numero: ");
            num = entrada.nextFloat();
            if(num!=0){
                if(num>0){
                    System.out.println("El numero "+num+" es positivo.");
                }
                else{
                    System.out.println("El numero "+num+" es negativo.");
                }
            }
            else{
                System.out.println("Introdujo un 0, programa terminado ...");
            }
        }while(num!=0);
        entrada.close();
    }
}