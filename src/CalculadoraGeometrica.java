import java.util.Scanner;

public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        int figura = scanner.nextInt();

        System.out.println("Seleccione una operación:");
        System.out.println("1. Área");
        System.out.println("2. Perímetro");
        int operacion = scanner.nextInt();

        switch (figura) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
                if (operacion == 1) {
                    double area = Math.PI * Math.pow(radio, 2);
                    System.out.println("Área del círculo: " + area);
                } else if (operacion == 2) {
                    double perimetro = 2 * Math.PI * radio;
                    System.out.println("Perímetro del círculo: " + perimetro);
                }
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                if (operacion == 1) {
                    double area = lado * lado;
                    System.out.println("Área del cuadrado: " + area);
                } else if (operacion == 2) {
                    double perimetro = 4 * lado;
                    System.out.println("Perímetro del cuadrado: " + perimetro);
                }
                break;
            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double altura = scanner.nextDouble();
                if (operacion == 1) {
                    double area = (base * altura) / 2;
                    System.out.println("Área del triángulo: " + area);
                } else if (operacion == 2) {
                    System.out.print("Ingrese el lado 1 del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Ingrese el lado 2 del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    double perimetro = base + lado1 + lado2;
                    System.out.println("Perímetro del triángulo: " + perimetro);
                }
                break;
            case 4:
                System.out.print("Ingrese el largo del rectángulo: ");
                double largo = scanner.nextDouble();
                System.out.print("Ingrese el ancho del rectángulo: ");
                double ancho = scanner.nextDouble();
                if (operacion == 1) {
                    double area = largo * ancho;
                    System.out.println("Área del rectángulo: " + area);
                } else if (operacion == 2) {
                    double perimetro = 2 * (largo + ancho);
                    System.out.println("Perímetro del rectángulo: " + perimetro);
                }
                break;
            case 5:
                System.out.print("Ingrese el lado del pentágono: ");
                double ladoPentagono = scanner.nextDouble();
                if (operacion == 1) {
                    System.out.print("Ingrese el apotema del pentágono: ");
                    double apotema = scanner.nextDouble();
                    double area = (5 * ladoPentagono * apotema) / 2;
                    System.out.println("Área del pentágono: " + area);
                } else if (operacion == 2) {
                    double perimetro = 5 * ladoPentagono;
                    System.out.println("Perímetro del pentágono: " + perimetro);
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
