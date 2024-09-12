package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_12 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int n,promedio,apr=0,des=0,apl=0;
        do{
            System.out.print("Ingrese la cantidad de promedios: ");
            n = entrada.nextInt();
        }while(n<0);
        for(int i=1;i<=n;i++){
            do{
                System.out.printf("Ingrese el promedio del alumno %d: ",i);
                promedio = entrada.nextInt();
            }while(promedio<0||promedio>20);
            if(promedio>=11){
                apr++;
            }
            else if(promedio<=10&&promedio>=8){
                apl++;
            }
            else if(promedio<8){
                des++;
            }
        }
        System.out.printf("Cantidad de alumnos aprobados: %d%n",apr);
        System.out.printf("Cantidad de alumnos aplazados: %d%n",apl);
        System.out.printf("Cantidad de alumnos desaprobados: %d%n",des);
        entrada.close();
    }
}