package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_6 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int n,num,pos=0,neg=0,ceros=0;
        float suma1=0,suma2=0;
        do{
            System.out.print("Ingrese la cantidad de números: ");
            n = entrada.nextInt();
        }while(n<0);
        for(int i=0;i<n;i++){
            System.out.print("Ingrese un número entero: ");
            num = entrada.nextInt();
            if(num>0){
                suma1+=num;
                pos++;
            }
            else if(num<0){
                suma2+=num;
                neg++;
            }
            else if(num==0){
                ceros++;
            }
        }
        System.out.printf("La media de los números positivos: %.2f%n",(suma1/pos));
        System.out.printf("La media de los números negativos: %.2f%n",(suma2/neg));
        System.out.println("La cantidad de ceros: "+ceros);
        entrada.close();
    }
}