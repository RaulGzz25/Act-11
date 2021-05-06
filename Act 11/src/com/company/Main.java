package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int operacion =0;
            System.out.println("¿Qué proceso quiere realizar?");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.println("0. Salir");
            operacion  = scanner.nextInt();
            switch (operacion)
            {
                case 0: System.out.println("Gracias por su visita");
                    break;
                case 1:
                    System.out.println("Elige el número de la figura deseada");
                    System.out.println("1 = Círculo");
                    System.out.println("2 = Triángulo");
                    System.out.println("3 = Cuadrado");
                    int FiguraArea  = scanner.nextInt();
                    switch (FiguraArea){
                        case 1:
                          Circle Areacirculo = new Circle();
                          Areacirculo.getArea();
                            break;
                        case 2:
                            Triangle AreaTriángulo=  new Triangle();
                            AreaTriángulo.getArea();
                            break;
                        case 3:
                            Square AreaCuadrado =  new Square();
                            AreaCuadrado.getArea();
                            break;
                        default: System.out.println("Opción no válida");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Elige el número de la figura deseada");
                    System.out.println("1 = Círculo");
                    System.out.println("2 = Triángulo");
                    System.out.println("3 = Cuadrado");
                    int FiguraPerimetro  = scanner.nextInt();
                    switch (FiguraPerimetro){
                        case 1:
                            Circle Perimetrocirculo =  new Circle();
                            Perimetrocirculo.getPerimeter();
                            break;
                        case 2:
                            Triangle PerimetroTriángulo =  new Triangle();
                            PerimetroTriángulo.getPerimeter();
                            break;
                        case 3:
                            Square Perimetrocuadrado =  new Square();
                            Perimetrocuadrado.getPerimeter();
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                default: System.out.println("Opción no válida");
                    break;
            }
    }

    public static class Circle implements Shape{
        public void circle  (){

        }

        public void getArea() {
           System.out.println("¿Cuál es la medida del radio?");
           Scanner scanner = new Scanner(System.in);
           float Radio  = scanner.nextInt();

           float Area = (float) (Math.PI * (Radio * Radio));
           System.out.println("El area del círculo es: " + Area);
        }

        public void getPerimeter() {
            System.out.println("¿Cuál es la medida del radio?");
            Scanner scanner = new Scanner(System.in);
            float Radio  = scanner.nextInt();

            float Perimetro = (Radio * 2);
            System.out.println("El perímetro del círculo es: " + Perimetro);
        }
    }

    public static class Triangle implements Shape{
        public void Triangle (){

        }

        public void getArea() {
            System.out.println("¿Cuál es la medida de la base?");
            Scanner scanner = new Scanner(System.in);
            float base = scanner.nextInt();
            System.out.println("¿Cuál es la medida de la altura?");
            float altura = scanner.nextInt();

            float Area = base * altura /2;
            System.out.println("El area del triángulo es: " + Area);
        }

        public void getPerimeter() {
            System.out.println("¿Cuál es la medida del lado 1");
            Scanner scanner = new Scanner(System.in);
            float lado1 = scanner.nextInt();
            System.out.println("¿Cuál es la medida del lado 2?");
            float lado2 = scanner.nextInt();
            System.out.println("¿Cuál es la medida del lado 3?");
            float lado3 = scanner.nextInt();

            float Perimetro = lado1 = lado2 + lado3;
            System.out.println("El perímetro del triángulo es: " + Perimetro);
        }
    }

    public static class Square implements Shape{
        public void Square (){

        }

        public void getArea() {
            System.out.println("¿Cuál es la medida del lado?");
            Scanner scanner = new Scanner(System.in);
            float lado = scanner.nextInt();

            float Area = lado * lado;
            System.out.println("El area del cuadrado es: " + Area);
        }

        public void getPerimeter() {
            System.out.println("¿Cuál es la medida del lado");
            Scanner scanner = new Scanner(System.in);
            float lado = scanner.nextInt();

            float Perimetro = lado * 4;
            System.out.println("El perímetro del cuadrado es: " + Perimetro);
        }
    }
}
