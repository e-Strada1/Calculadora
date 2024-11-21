import java.util.Scanner;

public class Calculadora{

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int opc=0;
        int n1;
        int n2;
        int resultado;
        while(opc !=5){
            System.out.println("1.Suma de dos numeros.\n2.Resta de numeros.\n3.Multiplicacion de numeros.\n4.División de numeros.\n5.Salir");;
            opc = in.nextInt();
            if(opc==1){
                System.out.println("Introduce un numero");
                n1 = in.nextInt();
                System.out.println("Introduce otro numero ");
                n2 = in.nextInt();
                resultado = n1+n2;
                System.out.println("El resultado de la suma es: "+resultado);
            }
            if(opc==2){System.out.println("Introduce un numero");
            n1 = in.nextInt();
            System.out.println("Introduce otro numero ");
            n2 = in.nextInt();
            resultado = n1-n2;
            System.out.println("El resultado de la resta es: "+resultado);
            }
            if(opc==5){
                System.out.println("Adios!!");
            }

        }



        in.close();
    }
}