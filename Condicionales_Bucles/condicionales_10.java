package Condicionales_Bucles;
import java.util.Scanner;
public class condicionales_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] precios = {3,10,5.3f,2.5f,7.45f,12,20,15,4,8.4f};
        int opc,codigo,litros,i=0,acu=0;
        float monto=0;
        do{
            System.out.println("\n1. Ingresar factura. ");
            System.out.println("2. Salir ");
            System.out.print("Elija una opción: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                i++;
                System.out.printf("FACTURA %d:%n",i);
                do{
                    System.out.print("Ingrese el codigo del 1-10: ");
                    codigo = entrada.nextInt();
                }while(codigo>10||codigo<1);
                if(codigo==2){
                    acu++;
                }
                System.out.print("Ingrese la cantidad vendida en litros: ");
                litros = entrada.nextInt();
                System.out.printf("Precio por litro: %.2f%n",precios[codigo-1]);
                monto+=litros*precios[codigo-1];
                case 2: break;
                default:
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }while(opc!=2);
        System.out.printf("\nEl monto total: %.2f%n",monto);
        System.out.printf("La cantidad de litros vendidos del articulo de codigo 2: %d%n",acu);
        entrada.close();
    }
}