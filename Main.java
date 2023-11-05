import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valoPi = 3.1416;

        System.out.println("1) CALCULAR EL ÁREA DE UN TRIANGULO.\n");
        System.out.println("Ingrese la base del triángulo: ");
        double base = entrada.nextFloat();
        System.out.println("Ingrese la altura del triángulo: ");
        double altura = entrada.nextFloat();
        double area = (base * altura) /2;
        System.out.println("El área del triángulo es; "+ area +"<---");

        System.out.println("\n/////////////\n");

        System.out.println("2) INGRESAR DOS NUMEROS POR LA CONSOLA Y SUMARLOS.");
        System.out.println("Ingresa el primer número: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Ingresa el segundo número: ");
        double numero2 = entrada.nextDouble();
        double suma = numero1 + numero2;
        System.out.println("La suma de los dos números es: "+suma+"");

        System.out.println("\n********************************\n");

        System.out.println("3) INGRESAR UN NÚMERO Y VISUALIZARLO AL CUADRADO");
        System.out.println("Ingrese un número: ");
        double num = entrada.nextDouble();
        double cuadrado = num * num ;
        System.out.println("El número al cuadrado es: " + cuadrado);

        System.out.println("\n********************************\n");

        System.out.println("4) ESCRIBIR UN PROGRAMA QUE CONVIERTA DE EUROS A DÓLARES");
        System.out.println("Ingrese el la cantidad de euros: ");
        double euro = entrada.nextDouble();
        double dolar = 1.07;
        double cambio = euro * dolar;
        System.out.println("El valor de cambio a dólares es: " + cambio);

        System.out.println("\n********************************\n");

        System.out.println("5) CALCULE EL AREA Y EL PERIMETRO DE UN CUADRADO INGRESANDO UN LADO DEL CUADRADO");
        System.out.println("Ingrese un lado del cuadrado: ");
        double lado = entrada.nextDouble();

        double areax = lado * lado;
        double perimetro = lado + lado + lado + lado;

        System.out.println("El área del cuadrado es: " + areax);
        System.out.println("El perimetro del cuadrado es: " + perimetro);

        System.out.println("\n********************************\n");

        System.out.println("6) CALCULE EL AREA Y EL VOLUMEN DE UN CILINDRO ");
        System.out.println("Ingrese la base del cilindro: ");
        double basecilindro = entrada.nextDouble();
        System.out.println("Ingrese la altura del cilindro: ");
        double alturacilindro = entrada.nextDouble();

        double areacilindro = 2*3.1416 * basecilindro * (basecilindro + alturacilindro);
        double volumen = 3.1416 * (basecilindro * basecilindro) * alturacilindro;

        System.out.println("El area del cilindro es: " + areacilindro + "cm²");
        System.out.println("El volumen del cilindro es: " + volumen);

        System.out.println("\n********************************\n");

        System.out.println("7) CALCULAR EL RADIO DE UNA CIRCUNFERENCIA Y CALCULAR LA LONGITUD DE LA MISMA Y EL AREA DEL CIRCULO INSCRITO");

        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = entrada.nextDouble();

        double longitud = 2 * 3.1416 * radio;
        double area1 = 3.1416 * (radio * radio);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area1);

        System.out.println("\n********************************\n");

        System.out.println("8) CALCULAR EL PROMEDIO DE 3 NÚMEROS INGRESADOS POR EL TECLADO ");
        System.out.println("Ingresar el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Ingresar el segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Ingresar el tercer número: ");
        double num3 = entrada.nextDouble();

        double promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio de los 3 números es: " + promedio);

    }
}