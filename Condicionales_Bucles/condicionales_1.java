package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_1 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        float num;
        do{
            System.out.print("Ingrese un número: ");
            num = entrada.nextFloat();
            if(num>=0){
                System.out.println("El cuadrado del número es: "+(Math.pow(num,2)));
            }
            else{
                System.out.println("Introdujo un número negativo, programa terminado ...");
            }
        }while(num>=0);
        entrada.close();
    }
}