package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_3 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        int num;
        do{
            System.out.print("Ingrese un número: ");
            num = entrada.nextInt();
            if(num!=0){
                if(num%2==0){
                    System.out.println("El número "+num+" es par.");
                }
                else{
                    System.out.println("El número "+num+" es impar.");
                }
            }
            else{
                System.out.println("Introdujo un 0, programa terminado ...");
            }
        }while(num!=0);
        entrada.close();
    }
}