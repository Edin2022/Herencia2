
package Ejercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido");

        CalculadoraAvanzada miCalculadora = new CalculadoraAvanzada("Mi Calculadora Avanzada");

        System.out.print("Introduce el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero entero: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el primer numero decimal: ");
        double num1Decimal = scanner.nextDouble();

        System.out.print("Introduce el segundo numero decimal: ");
        double num2Decimal = scanner.nextDouble();

        // Llamadas a métodos de la clase padre
        System.out.println("Suma: " + miCalculadora.sumar(num1, num2));
        System.out.println("Resta: " + miCalculadora.restar(num1, num2));
        System.out.println("Multiplicacion: " + miCalculadora.multiplicar(num1, num2));
        System.out.println("Division: " + miCalculadora.dividir(num1, num2));
        System.out.println("Raiz Cuadrada: " + miCalculadora.raizCuadrada(num1));
        System.out.println("Elevar al Cuadrado: " + miCalculadora.elevarAlCuadrado(num1));
        System.out.println("Elevar al Cubo: " + miCalculadora.elevarAlCubo(num1));
        System.out.println("Seno: " + miCalculadora.calcularSeno(num1));
        System.out.println("Coseno: " + miCalculadora.calcularCoseno(num1));

        // Llamadas a métodos de la clase hija
        System.out.println("Suma Decimales: " + miCalculadora.sumarDecimales(num1Decimal, num2Decimal));
        System.out.println("Resta Decimales: " + miCalculadora.restarDecimales(num1Decimal, num2Decimal));
        System.out.println("Multiplicacion Decimales: " + miCalculadora.multiplicarDecimales(num1Decimal, num2Decimal));
        System.out.println("Division Decimales: " + miCalculadora.dividirDecimales(num1Decimal, num2Decimal));
        System.out.println("Tangente: " + miCalculadora.calcularTangente(num1Decimal));
        System.out.println("Logaritmo: " + miCalculadora.calcularLogaritmo(num1Decimal));
        System.out.println("Exponencial: " + miCalculadora.calcularExponencial(num1Decimal));
        System.out.println("Potencia: " + miCalculadora.calcularPotencia(num1Decimal, num2Decimal));
        System.out.println("Hipotenusa: " + miCalculadora.calcularHipotenusa(num1, num2));
        System.out.println("Grados a Radianes: " + miCalculadora.convertirGradosARadianes(num1Decimal));
    }
}
   
