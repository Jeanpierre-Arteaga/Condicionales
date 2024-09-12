package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_15 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int edad,n,mujeres=0,conta1=0,conta2=0;
        String sexo;
        boolean a=true;
        float sueldo,sueldo_mayor=0,sueldo_menor=0,suma1=0,suma2=0;
        do{
            System.out.print("Ingrese la cantidad de trabajadores: ");
            n = entrada.nextInt();
        }while(n<0);
        for(int i=1;i<=n;i++){
            System.out.printf("\nTRABAJADOR %d:%n",i);
            do{
                System.out.print("Ingrese la edad del trabajador: ");
                edad = entrada.nextInt();
            }while(edad<0);
            while(true){
                System.out.print("Ingrese el sexo del trabajador (hombre o mujer): ");
                sexo = entrada.next();
                if(sexo.equals("hombre") || sexo.equals("mujer")){
                    break;
                }
            }
            do{
                System.out.print("Ingrese el sueldo del trabajador: ");
                sueldo = entrada.nextFloat();
            }while(sueldo<0);
            if(sexo.equals("hombre")){
                suma1+=sueldo;
                if(sueldo<1000){
                    conta1++;
                }
            }
            else if(sexo.equals("mujer")){
                suma2+=sueldo; 
                mujeres++;
                if(edad<18){
                    conta2++;
                }
            }
            if(sueldo>sueldo_mayor){
                sueldo_mayor=sueldo;
            }
            //Para guardar el primer sueldo
            if(a){
                sueldo_menor = sueldo;
                a = false;
            }
            if(sueldo<sueldo_menor){
                sueldo_menor=sueldo;
            }
        }
        System.out.printf("\nLa suma de los sueldos de los hombres: %.2f%n",suma1);
        System.out.printf("El promedio de sueldos de las mujeres: %.2f%n",(suma2/mujeres));
        System.out.printf("El mayor sueldo de todos los trabajadores: %.2f%n",(sueldo_mayor));
        System.out.printf("El menor sueldo de todos los trabajadores: %.2f%n",(sueldo_menor));
        System.out.println("La cantidad de mujeres menores de edad: "+conta2);
        System.out.println("La cantidad de hombres cuyos sueldos sean menos a 1000 soles: "+conta1);
        entrada.close();
    }
}