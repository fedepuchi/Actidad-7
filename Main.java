import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




    
public class Main{
    public static void main(String[] args) {
        
        List<Double> resultados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        try {
            do {

                System.out.println("\nn--MENU--");
                System.out.println("1. Cuadrado");
                System.out.println("2. Rectangulo");
                System.out.println("3. Triangulo");
                System.out.println("4. Circulo");
                System.out.println("5. Pentágono");
                System.out.println("6. Potencia");
                System.out.println("0. Salir");
                System.out.print("Opcion: ");
                opcion = scanner.nextInt();
    
                switch (opcion) {
                    case 1:
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion2 = scanner.nextInt();
                        if (opcion2 == 1) {
                            System.out.print("Ingrese el lado del cuadrado: ");
                            float lado = scanner.nextFloat();
                            double perimetro = lado * 4;
                            System.out.println("El perimetro del cuadrado es: " + perimetro);
                            resultados.add(perimetro);

                        } else if (opcion2 == 2) {
                            System.out.print("Ingrese el lado del cuadrado: ");
                            float lado = scanner.nextFloat();
                            double area = lado * lado;
                            System.out.println("El area del cuadrado es: " + area);
                            resultados.add(area);
                        } else {
                            System.out.println("Opcion invalida");
                        }
                        
            
                        break;
                    case 2:
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion3 = scanner.nextInt();
                        if (opcion3 == 1) {
                            System.out.print("Ingrese la base del rectangulo: ");
                            float base = scanner.nextFloat();
                            System.out.print("Ingrese la altura del rectangulo: ");
                            float altura = scanner.nextFloat();
                            double perimetro = 2 * (base + altura);
                            System.out.println("El perimetro del rectangulo es: " + perimetro);
                            resultados.add(perimetro);
                        } else if (opcion3 == 2) {
                            System.out.print("Ingrese la base del rectangulo: ");
                            float base = scanner.nextFloat();
                            System.out.print("Ingrese la altura del rectangulo: ");
                            float altura = scanner.nextFloat();
                            double area = base * altura;
                            System.out.println("El area del rectangulo es: " + area);
                            resultados.add(area);
                        } else {
                            System.out.println("Saliendo");
                            
                        }
                        break;
    
                    case 3:
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion4 = scanner.nextInt();
                        if (opcion4 == 1) {
                            System.out.print("Ingrese el lado del triangulo: ");
                            float lado = scanner.nextFloat();
                            double perimetro = lado * 3;
                            System.out.println("El perimetro del triangulo es: " + perimetro);
                            resultados.add(perimetro);
                        } else if (opcion4 == 2) {
                            System.out.print("Ingrese la base del triangulo: ");
                            float base = scanner.nextFloat();
                            System.out.print("Ingrese la altura del triangulo: ");
                            float altura = scanner.nextFloat();
                            double area = (base * altura) / 2.0;
                            System.out.println("El area del triangulo es: " + area);
                            resultados.add(area);
                        } else {
                            System.out.println("Saliendo");
                            
                        }
                        break;
    
                    case 4:
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion5 = scanner.nextInt();
                        if (opcion5 == 1) {
                            System.out.print("Ingrese el radio del circulo: ");
                            float radio = scanner.nextFloat();
                            double perimetro = 2 * Math.PI * radio;
                            System.out.println("El perimetro del circulo es: " + perimetro);
                            resultados.add(perimetro);
                        } else if (opcion5 == 2) {
                            System.out.print("Ingrese el radio del circulo: ");
                            float radio = scanner.nextFloat();
                            double area = Math.PI * Math.pow(radio, 2);
                            System.out.println("El area del circulo es: " + area);
                            resultados.add(area);
                        } else {
                            System.out.println("Saliendo");
                            
                        }
                        break;
    
                    case 5 :
                        System.out.println("1. Calcular perimetro, 2. Calcular area, 0. Salir");
                        int opcion6 = scanner.nextInt();
                        if (opcion6 == 1) {
                            System.out.print("Ingrese el lado del pentágono: ");
                            float lado = scanner.nextFloat();
                            double perimetro = lado * 5;
                            System.out.println("El perimetro del pentágono es: " + perimetro);
                            resultados.add(perimetro);
                        } else if (opcion6 == 2) {
                            System.out.print("Ingrese el lado del pentágono: ");
                            float lado = scanner.nextFloat();
                            System.out.print("Ingrese el apotema del pentágono: ");
                            float apotema = scanner.nextFloat();
                            double area = (5 * lado * apotema) / 2.0;
                            System.out.println("El area del pentágono es: " + area);
                            resultados.add(area);
                        } else {
                            System.out.println("Saliendo");
                            
                        }
                        break;

                    case 6:
                        System.out.print("Ingrese la base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese el exponente: ");
                        double exponente = scanner.nextDouble();
                        double potencia = Math.pow(base, exponente);
                        System.out.println("La potencia es: " + potencia);
                        resultados.add(potencia);
                        break;
    
                    case 0:
                        System.out.println("Hasta luego!");
                        for (int i = 0; i < resultados.size(); i++) {
                            System.out.println("Resultado " + (i + 1) + ": " + resultados.get(i));
                        }
                        break;
                    default:
                        System.out.println("Opcion invalida");
                }
            } while (opcion != 0);
            scanner.close();  
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            scanner.close();
        }     
    }
            
}
