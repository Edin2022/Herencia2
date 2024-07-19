
package Ejercicio;


public class Calculadora {
    private String nombre;

    public Calculadora(String nombre) {
        this.nombre = nombre;
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return 0;
        }
    }

    public double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    public int elevarAlCuadrado(int a) {
        return a * a;
    }

    public int elevarAlCubo(int a) {
        return a * a * a;
    }

    public double calcularSeno(double angulo) {
        return Math.sin(Math.toRadians(angulo));
    }

    public double calcularCoseno(double angulo) {
        return Math.cos(Math.toRadians(angulo));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}