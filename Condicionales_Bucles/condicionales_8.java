package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_8 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int n,edad,mayor1=0,mayor2=0;
        float altura,suma1=0,suma2=0;
        do{
            System.out.print("Ingrese la cantidad de alumnos: ");
            n = entrada.nextInt();
        }while(n<0);
        for(int i=1;i<=n;i++){
            do{
                System.out.printf("\nIngrese la edad del alumno %d: ",i);
                edad = entrada.nextInt();
            }while(edad<0);
            do{
                System.out.printf("Ingrese la altura del alumno %d: ",i);
                altura = entrada.nextFloat();
            }while(altura<0);
            suma1+=edad;
            suma2+=altura;
            if(edad>18){
                mayor1++;
            }
            if(altura>1.75){
                mayor2++;
            }
        }
        System.out.printf("\nLa edad media: %.2f%n",(suma1/n));
        System.out.printf("La altura media: %.2f%n",(suma2/n));
        System.out.printf("Cantidad de alumnos mayores de 18 años: %d%n",mayor1);
        System.out.printf("Cantidad de alumnos que miden más de 1.75: %d",mayor2);
        entrada.close();
    }
}