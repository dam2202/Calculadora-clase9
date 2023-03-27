package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            Calculadora calc = new Calculadora();

            System.out.println("suma: " + calc.sumar(3,2));
            System.out.println("restar: " + calc.restar(10,5));
            System.out.println("multiplicar: " + calc.multiplicar(3,3));
            System.out.println("dividir: " + calc.dividir(27,3));
            System.out.println("dividir: " + calc.dividir(8,0));

        }
        catch (Exception e){
            System.out.printf("Exception: " + e.getMessage());
        }

    }
}