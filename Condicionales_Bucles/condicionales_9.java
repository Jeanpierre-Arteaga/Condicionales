package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        while(true){
            System.out.print("Ingrese un numero entero mayor a 0: ");
            num = entrada.nextInt();
            if(num>0){
                break;
            }
            else{
                System.out.println("No cumple con la condición... ");
            }
        }
        for(int i=0;i<=12;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
        entrada.close();
    }
}