import java.util.Scanner;

public class Variables_2 {
    public static double lado1, lado2, lado3, altura, radio, perimetro, area;

    public Variables_2(){

    }

    public void metodo2_1(){
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("1.-Cuadrado/Rectangulo");
        System.out.println("2.-Triangulo");
        System.out.println("3.-Circulo");

        opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                Cuadrado_Rectangulo();
                break;

            case 2:
                Triangulo();
                break;

            case 3:
                Circulo();
                break;

        }
    }

    public static void Cuadrado_Rectangulo() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cual es el ancho?");
        lado1 = entrada.nextDouble();
        System.out.println("¿Cual es la altura?");
        altura = entrada.nextDouble();

        area = lado1*altura;
        perimetro = lado1+lado1+altura+altura;

        System.out.println("El area es de "+area);
        System.out.println("El perimetro es de "+perimetro);
    }

    public static void Triangulo() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cual es la altura?");
        altura = entrada.nextDouble();
        System.out.println("¿Cual es la base?");
        lado1 = entrada.nextDouble();
        System.out.println("¿Cual es el segundo lado?");
        lado2 = entrada.nextDouble();
        System.out.println("¿Cual es el tercer lado?");
        lado3 = entrada.nextDouble();

        area = (altura*lado1)/2;
        perimetro = lado1+lado2+lado3;

        System.out.println("El area es de "+area);
        System.out.println("El perimetro es de "+perimetro);
    }

    public static void Circulo() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cual es el radio?");
        radio = entrada.nextDouble();

        area = 3.1*radio*radio;
        perimetro= 3.1*2*radio;

        System.out.println("El area es de "+area);
        System.out.println("El perimetro es de "+perimetro);
    }
}
