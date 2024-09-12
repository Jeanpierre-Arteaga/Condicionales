package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_5 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1,num2,i=0;
        System.out.print("Ingrese el número a adivinar: ");
        num1 = entrada.nextInt();
        do{
            System.out.printf("%d° INTENTO - Ingrese un número: ",(i+1));
            num2= entrada.nextInt();
            if(num2>num1){
                System.out.printf("El número %d es mayor al que se intenta adivinar.%n",num2);
            }
            else if(num2<num1){
                System.out.printf("El número %d es menor al que se intenta adivinar.%n",num2);
            }
            i++;
        }while(num1!=num2);
        if(num1==num2){
            System.out.printf("Adivinanste, el número %d es el correcto.%nNúmero de intentos: %d%nPrograma terminado...",num2,i);
        }
        entrada.close();
    }
}