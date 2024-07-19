
package Ejercicio;


  public class CalculadoraAvanzada extends Calculadora {

    public CalculadoraAvanzada(String nombre) {
        super(nombre);
    }

    public double sumarDecimales(double a, double b) {
        return a + b;
    }

    public double restarDecimales(double a, double b) {
        return a - b;
    }

    public double multiplicarDecimales(double a, double b) {
        return a * b;
    }

    public double dividirDecimales(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }

    public double calcularTangente(double angulo) {
        return Math.tan(Math.toRadians(angulo));
    }

    public double calcularLogaritmo(double a) {
        return Math.log(a);
    }

    public double calcularExponencial(double a) {
        return Math.exp(a);
    }

    public double calcularPotencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.hypot(cateto1, cateto2);
    }

    public double convertirGradosARadianes(double grados) {
        return Math.toRadians(grados);
    }
}