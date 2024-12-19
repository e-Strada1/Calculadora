
public class Calculadora{

    public static void main(String args[]){

        double num1 = 10.5;
        char operador = '+';
        double num2 = 3.2;
        double resultado = 0;
        switch (operador) {
            case '-':
                resultado = num1 - num2;
                break;
            case '+':
                resultado = num1 + num2;
                break;
            default:
                System.out.println("Operador inválido");
            return;
        }
        System.out.println("Resultado: " + resultado);
    }
}